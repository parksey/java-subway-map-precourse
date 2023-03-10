package subway.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import subway.station.domain.Station;
import subway.station.domain.StationException;
import subway.station.domain.StationRepository;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StationTest {

    @ParameterizedTest
    @ValueSource(strings = {"1", "r", "가"})
    public void notLimitLength_test(String userInput) {
        assertThatThrownBy(() -> {
            StationException.notLimitLength(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"가나", "오역", "역역"})
    public void notInRepository_test(String userInput) {
        assertThatThrownBy(() -> {
            StationException.notInRepository(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void station_Test() {
        Station 교대역 = Station.of("교대역");
        Station 강남역 = Station.of("강남역");
        StationRepository.addStation(교대역);
        StationRepository.addStation(강남역);
        assertThatThrownBy(() -> {
            StationRepository.addStation(교대역);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
