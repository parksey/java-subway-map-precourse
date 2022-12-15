package subway.line.controller;

import subway.controller.Controllerable;
import subway.line.domain.LineDomain;
import subway.station.domain.Station;
import subway.util.LineFunction;
import subway.util.PrintMsg;
import subway.util.StationFunction;
import subway.view.InputView;
import subway.view.OutputView;

public class LineController implements Controllerable {
    private final InputView inputView;
    private final OutputView outputView;
    private final LineDomain lineDomain;

    public LineController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.lineDomain = new LineDomain();
    }
    @Override
    public void start() {
        String lineSelect = readSelectionInput();
        selectFunction(lineSelect);
    }

    public String readSelectionInput() {
        outputView.printLine();
        return getLineInput();
    }
    public String getLineInput() {
        while (true) {
            try {
                outputView.printEmptyMsg();
                outputView.printMsg(PrintMsg.INPUT_SELECT.getMsg());
                return inputView.getDetailInput();
            } catch (IllegalArgumentException exception) {
                outputView.printEmptyMsg();
                outputView.printMsg(exception.getMessage());
            }
        }
    }

    public boolean selectFunction(String select) {
        if (select.equals(LineFunction.REGIST.getSelect())) {
            registStationName();
            return true;
        }
        if (select.equals(LineFunction.DELETE.getSelect())) {
            deleteStationName();
            return true;
        }

        if (select.equals(LineFunction.SEARCH.getSelect())) {
            searchStation();
            return true;
        }
        return false;
    }

    /**
     * 노선 등록 함수
     */
    public void registStationName() {
        if (getRegistStationName()) {
            outputView.printEmptyMsg();
            outputView.printMsg(PrintMsg.SUCCESS_LINE_REGIST.getMsg());
        }
    }

    public boolean getRegistStationName() {
        try {
            String lineName = getLineName();
            Station upStation = registStation(PrintMsg.INPUT_UPSTATION.getMsg());
            Station downStation = registStation(PrintMsg.INPUT_DOWNSTATIOIN.getMsg());
            return lineDomain.regist(lineName, upStation, downStation);
        } catch (IllegalArgumentException exception) {
            outputView.printEmptyMsg();
            outputView.printMsg(exception.getMessage());
        }
        return false;
    }

    public String getLineName() {
        outputView.printEmptyMsg();
        outputView.printMsg(PrintMsg.INPUT_LINE_NAME.getMsg());
        return lineDomain.getStringName(inputView.getStationName());
    }

    public Station registStation(String msg) {
        outputView.printEmptyMsg();
        outputView.printMsg(msg);
        return lineDomain.getStation(inputView.getStationName());
    }

    public void deleteStationName() {
        if (getDeleteStationName()) {
            outputView.printEmptyMsg();
            outputView.printMsg(PrintMsg.SUCCESS_LINE_DELETE.getMsg());
        }
    }
    public boolean getDeleteStationName() {
        try {
            outputView.printEmptyMsg();
            outputView.printMsg(PrintMsg.INPUT_LINE_DELETE.getMsg());
            return lineDomain.delete(inputView.getStationName());
        } catch (IllegalArgumentException exception) {
            outputView.printEmptyMsg();
            outputView.printMsg(exception.getMessage());
        }
        return false;
    }

    public void searchStation() {
        outputView.printLines(lineDomain.search());
    }
}
