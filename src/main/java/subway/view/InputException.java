package subway.view;

import subway.util.MainFunction;
import subway.util.SectionFunction;
import subway.util.StationFunction;

public class InputException {
    public static void nullException(String userInput) {
        if (userInput == null || userInput.isBlank() || userInput.isEmpty()) {
            throw new IllegalArgumentException("아무 값도 입력하지 않았습니다.");
        }
    }

    public static void notMainFunction(String userInput) {
        if (!MainFunction.isMainFunction(userInput)) {
            throw new IllegalArgumentException("메인 기능 값이 아닙니다.");
        }
    }

    public static void notDetailFunction(String userInput) {
        if (!StationFunction.isStationFunction(userInput)) {
            throw new IllegalArgumentException("역이나 노션 관련 기능 선택이 아닙니다.");
        }
    }

    public static void notSectionFunction(String userInput) {
        if (!SectionFunction.isSectionFunction(userInput)) {
            throw new IllegalArgumentException("구간 관리 기능 선택이 아닙니다.");
        }
    }
}
