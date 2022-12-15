package subway.line.domain;

import subway.station.domain.Station;
import subway.station.domain.StationRepository;
import subway.util.ExceptionMsg;
import subway.util.SubwayCode;

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
}
