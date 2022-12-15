package subway.view;

import subway.util.MainFunction;

public class InputException {
    public static void nullException(String userInput) {
        if (userInput == null || userInput.isBlank() || userInput.isEmpty()) {
            throw new IllegalArgumentException("아무 값도 입력하지 않았습니다.");
        }
    }

    public static void notMainFunction(String userInput) {
        if (MainFunction.isMainFunction(userInput)) {
            throw new IllegalArgumentException("메인 기능 값이 아닙니다.");
        }
    }
}
