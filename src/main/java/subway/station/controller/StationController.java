package subway.station.controller;

import subway.controller.Controllerable;
import subway.station.domain.StationDomain;
import subway.util.MainFunction;
import subway.util.PrintMsg;
import subway.util.StationFunction;
import subway.view.InputView;
import subway.view.OutputView;

public class StationController implements Controllerable {
    private final InputView inputView;
    private final OutputView outputView;
    private final StationDomain stationDomain;

    public StationController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.stationDomain = new StationDomain();
    }
    @Override
    public void start() {
        String stationSelect = readStationInput();
        selectFunction(stationSelect);
    }

    public String readStationInput() {
        outputView.printStation();
        return getStationInput();
    }
    public String getStationInput() {
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
        if (select.equals(StationFunction.REGIST.getSelect())) {
            registStationName();
            return true;
        }
        if (select.equals(StationFunction.DELETE.getSelect())) {
            deleteStationName();
            return true;
        }

        if (select.equals(StationFunction.SEARCH.getSelect())) {
            searchStation();
            return true;
        }
        return false;
    }

    /**
     * 역 등록 함수
     */
    public void registStationName() {
        if (getRegistStationName()) {
            outputView.printEmptyMsg();
            outputView.printMsg(PrintMsg.SUCCESS_STATION_REGIST.getMsg());
        }
    }

    public boolean getRegistStationName() {
        try {
            outputView.printEmptyMsg();
            outputView.printMsg(PrintMsg.INPUT_STATION_REGIST.getMsg());
            return stationDomain.regist(inputView.getStationName());
        } catch (IllegalArgumentException exception) {
            outputView.printEmptyMsg();
            outputView.printMsg(exception.getMessage());
        }
        return false;
    }

    public void deleteStationName() {
        if (getDeleteStationName()) {
            outputView.printEmptyMsg();
            outputView.printMsg(PrintMsg.SUCCESS_STATION_DELETE.getMsg());
        }
    }
    public boolean getDeleteStationName() {
        try {
            outputView.printEmptyMsg();
            outputView.printMsg(PrintMsg.INPUT_STATION_DELETE.getMsg());
            return stationDomain.delete(inputView.getStationName());
        } catch (IllegalArgumentException exception) {
            outputView.printEmptyMsg();
            outputView.printMsg(exception.getMessage());
        }
        return false;
    }

    public void searchStation() {
        outputView.printStations(stationDomain.search());
    }

}
