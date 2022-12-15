package subway.line.controller;

import subway.controller.Controllerable;
import subway.view.InputView;
import subway.view.OutputView;

public class LineController implements Controllerable {
    private final InputView inputView;
    private final OutputView outputView;

    public LineController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }
    @Override
    public void start() {

    }
}
