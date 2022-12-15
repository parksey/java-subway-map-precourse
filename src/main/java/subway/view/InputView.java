package subway.view;

import java.util.Scanner;

public class InputView {
    private final Scanner sc;

    public InputView(Scanner sc) {
        this.sc = sc;
    }

    public String getUserInput() {
        return sc.nextLine();
    }

    /**
     * 메인 화면 기능 입력
     * @return
     */
    public String getMainInput() {
        String userInput = getUserInput();
        checkMainInput(userInput);
        return userInput;
    }
    public void checkMainInput(String userInpt) {
        InputException.nullException(userInpt);
        InputException.notMainFunction(userInpt);
    }

    /**
     * 역 관리, 노선 관리 화면 기능 입력
     * @return
     */
    public String getDetailInput() {
        String userInput = getUserInput();
        checkDetailInput(userInput);
        return userInput;
    }
    public void checkDetailInput(String userInpt) {
        InputException.nullException(userInpt);
        InputException.notDetailFunction(userInpt);
    }

    public String getStationName() {
        String userInput = getUserInput();
        InputException.nullException(userInput);
        return userInput;
    }

    /**
     * 구간 관리 화면 기능 입력
     * @return
     */
    public String getSectionInput() {
        String userInput = getUserInput();
        checkSectionInput(userInput);
        return userInput;
    }
    public void checkSectionInput(String userInpt) {
        InputException.nullException(userInpt);
        InputException.notSectionFunction(userInpt);
    }

    public int getOrder() {
        String userInput = getUserInput();
        checkDetailInput(userInput);
        return Integer.parseInt(userInput);
    }
    public void checkOrderInput(String userInput) {
        InputException.nullException(userInput);
        InputException.notNumberException(userInput);
    }
}
