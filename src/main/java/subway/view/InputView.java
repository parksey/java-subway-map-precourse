package subway.view;

import java.util.Scanner;

public class InputView {
    private final Scanner sc = new Scanner(System.in);
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
     * 역 관리 화면 기능 입력
     * @return
     */
    public String getStationInput() {
        String userInput = getUserInput();
        return userInput;
    }

    /**
     * 노선 관리 화면 기능 입력
     * @return
     */
    public String getLineInput() {
        String userInput = getUserInput();
        return userInput;
    }

    /**
     * 구간 관리 화면 기능 입력
     * @return
     */
    public String getSectionInput() {
        String userInput = getUserInput();
        return userInput;
    }


}
