package subway.view;

import subway.util.ExceptionMsg;
import subway.util.MainFunction;
import subway.util.SectionFunction;
import subway.util.StationFunction;

public class InputException {
    public static void nullException(String userInput) {
        if (userInput == null || userInput.isBlank() || userInput.isEmpty()) {
            throw new IllegalArgumentException(ExceptionMsg.NULL.getMsg());
        }
    }

    public static void notMainFunction(String userInput) {
        if (!MainFunction.isMainFunction(userInput)) {
            throw new IllegalArgumentException(ExceptionMsg.NOT_MAIN_FUNCTION.getMsg());
        }
    }

    public static void notDetailFunction(String userInput) {
        if (!StationFunction.isStationFunction(userInput)) {
            throw new IllegalArgumentException(ExceptionMsg.NOT_DETAIL_FUNCTION.getMsg());
        }
    }

    public static void notSectionFunction(String userInput) {
        if (!SectionFunction.isSectionFunction(userInput)) {
            throw new IllegalArgumentException(ExceptionMsg.NOT_SECTION_FUNCTION.getMsg());
        }
    }
}
