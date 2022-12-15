package subway.station.domain;

import subway.util.SubwayCode;

public class StationException {
    public static void notLimitLength(String userInput) {
        if (userInput.length() <= SubwayCode.NAME_LIMIT.getCode()) {
            throw new IllegalArgumentException("이름은 최소 2글자 이상입니다.");
        }
    }

    public static void notInRepository(String userInput) {
        if (isInRepository(userInput)) {
            throw new IllegalArgumentException("이미 존재하는 역입니다.");
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
