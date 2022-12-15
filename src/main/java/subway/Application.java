package subway;

import subway.controller.SubwayController;
import subway.view.InputView;
import subway.view.OutputView;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO: 프로그램 구현
        InputView inputView = new InputView(scanner);
        SubwayController subwayController = new SubwayController(inputView, new OutputView());
        subwayController.initController();
        subwayController.start();
    }
}
