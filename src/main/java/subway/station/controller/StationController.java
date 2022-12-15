package subway.station.controller;

import subway.controller.Controllerable;
import subway.util.MainFunction;
import subway.util.PrintMsg;
import subway.util.StationFunction;
import subway.view.InputView;
import subway.view.OutputView;

public class StationController implements Controllerable {
    private final InputView inputView;
    private final OutputView outputView;

    public StationController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }
    @Override
    public void start() {
        boolean isBack = false;
        while (!isBack) {
            String stationSelect = readStationInput();
            isBack = selectFunction(stationSelect);
        }
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
            // 역 등록
            return true;
        }
        if (select.equals(StationFunction.DELETE.getSelect())) {
            // 역 삭제
            return true;
        }

        if (select.equals(StationFunction.SEARCH.getSelect())) {
            // 역 조회
            return true;
        }
        return false;
    }


}
