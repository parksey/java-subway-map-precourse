package subway.view;

import subway.util.MainFunction;
import subway.util.PrintMsg;

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
}
