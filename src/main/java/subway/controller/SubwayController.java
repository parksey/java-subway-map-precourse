package subway.controller;

import subway.domain.Station;
import subway.view.InputView;
import subway.view.OutputView;

public class SubwayController implements Controllerable{
    private final InputView inputView;
    private final OutputView outputView;

    public SubwayController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void initController() {
        Station 교대역 = Station.of("교대역");
        Station 강남역 = Station.of("강남역");
        Station 역삼역 = Station.of("역삼역");
        Station 교대남부터미널역 = Station.of("남부터미널");
        Station 양재역 = Station.of("양재역");
        Station 양재시민의숲역 = Station.of("양재시민의숲역");
        Station 매봉역 = Station.of("매봉역");


    }


    @Override
    public void start() {

    }
}
