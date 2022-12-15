package subway.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import subway.line.domain.LineException;
import subway.station.domain.Station;
import subway.station.domain.StationException;
import subway.station.domain.StationRepository;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LineTest {
    @ParameterizedTest
    @ValueSource(strings = {"1", "r", "가"})
    public void notLimitLength_test(String userInput) {
        assertThatThrownBy(() -> {
            LineException.notLimitLength(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"2호선", "3호선"})
    public void notInRepository_test(String userInput) {
        assertThatThrownBy(() -> {
            LineException.notInRepository(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
