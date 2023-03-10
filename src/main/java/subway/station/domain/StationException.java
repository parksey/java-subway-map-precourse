package subway.station.domain;

import subway.util.ExceptionMsg;
import subway.util.SubwayCode;

public class StationException {
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
        for (Station station : StationRepository.stations()) {
            if (station.getName().equals(userInput)) {
                return true;
            }
        }
        return false;
    }

}
