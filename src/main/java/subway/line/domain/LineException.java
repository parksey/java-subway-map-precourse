package subway.line.domain;

import subway.domain.LineStations;
import subway.station.domain.Station;
import subway.station.domain.StationRepository;
import subway.util.ExceptionMsg;
import subway.util.PrintMsg;
import subway.util.SubwayCode;

import java.util.List;

public class LineException {
    public static void notLimitLength(String userInput) {
        if (userInput.length() <= SubwayCode.NAME_LIMIT.getCode()) {
            throw new IllegalArgumentException(ExceptionMsg.LIMIT_LENGTH.getMsg());
        }
    }

    public static void notInRepository(String userInput) {
        if (isInRepository(userInput)) {
            throw new IllegalArgumentException(ExceptionMsg.EXIST_STATION.getMsg());
        }
    }

    private static boolean isInRepository(String userInput) {
        for (Line line : LineRepository.lines()) {
            if (line.getName().equals(userInput)) {
                return true;
            }
        }
        return false;
    }

    public static void isStationInLineException(String stationName) {
        if (!LineRepository.search(Station.of(stationName))) {
            throw new IllegalArgumentException(ExceptionMsg.CANNOT_DELETE.getMsg());
        }
    }

    public static void outOfRangeException(String lineName, long order) {
        Line line = LineRepository.findLine(lineName);
        isOutOfRange(line.getLineStations(), order);
    }

    public static void isOutOfRange(LineStations lineStations, long order) {
        List<Station> stations = lineStations.getLineStations();
        if (stations.size() + 1< order || order > 0) {
            throw new IllegalArgumentException(ExceptionMsg.OUT_OF_RANGE.getMsg());
        }
    }
}
