package subway.controller;

import subway.domain.LineStations;
import subway.line.domain.Line;
import subway.line.domain.LineRepository;
import subway.station.domain.Station;
import subway.station.domain.StationRepository;
import subway.view.InputView;
import subway.view.OutputView;

import java.util.Arrays;

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
        Station 남부터미널역 = Station.of("남부터미널");
        Station 양재역 = Station.of("양재역");
        Station 양재시민의숲역 = Station.of("양재시민의숲역");
        Station 매봉역 = Station.of("매봉역");

        StationRepository.addStation(교대역);
        StationRepository.addStation(강남역);
        StationRepository.addStation(역삼역);
        StationRepository.addStation(남부터미널역);
        StationRepository.addStation(양재역);
        StationRepository.addStation(양재시민의숲역);
        StationRepository.addStation(매봉역);

        Line secondLine = Line.of("2호선", LineStations.of(Arrays.asList(교대역, 강남역, 역삼역)));
        Line thirdLine = Line.of("3호선", LineStations.of(Arrays.asList(교대역, 남부터미널역,양재역, 매봉역)));
        Line 신분당선 = Line.of("신분당선", LineStations.of(Arrays.asList(강남역, 양재역, 양재시민의숲역)));

        LineRepository.addLine(secondLine);
        LineRepository.addLine(thirdLine);
        LineRepository.addLine(신분당선);
    }


    @Override
    public void start() {

    }
}
