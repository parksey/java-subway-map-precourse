package subway.controller;

import subway.util.MainFunction;
import subway.util.PrintMsg;
import subway.view.InputView;
import subway.view.OutputView;

public class SectionController implements Controllerable{
    private final InputView inputView;
    private final OutputView outputView;

    public SectionController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    @Override
    public void start() {

    }

}
