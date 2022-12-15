package subway.view;

import subway.line.domain.Line;
import subway.station.domain.Station;
import subway.util.LineFunction;
import subway.util.MainFunction;
import subway.util.PrintMsg;
import subway.util.StationFunction;

import java.util.List;

public class OutputView {
    public void printMsg(String msg) {
        System.out.println(msg);
    }

    public void printEmptyMsg() {
        System.out.println();
    }

    /**
     * 메인 화면 출력 함수
     */
    public void printMain() {
        printMsg(PrintMsg.INPUT_MAIN.getMsg());
        for (MainFunction mainFunction : MainFunction.values()) {
            printMsg(mainFunction.getMsg());
        }
    }

    public void printStation() {
        printMsg(PrintMsg.INPUT_STATION.getMsg());
        for (StationFunction stationFunction : StationFunction.values()) {
            printMsg(stationFunction.getMsg());
        }
    }

    public void printStations(List<Station> stations) {
        printMsg(PrintMsg.STATION_LIST.getMsg());
        for (Station station : stations) {
            printMsg(PrintMsg.INFO.getMsg() + station.getName());
        }
    }

    public void printLine() {
        printMsg(PrintMsg.INPUT_LINE.getMsg());
        for (LineFunction lineFunction : LineFunction.values()) {
            printMsg(lineFunction.getMsg());
        }
    }

    public void printLines(List<Line> lines) {
        printMsg(PrintMsg.LINE_LIST.getMsg());
        for (Line station : lines) {
            printMsg(PrintMsg.INFO.getMsg() + station.getName());
        }
    }
}
