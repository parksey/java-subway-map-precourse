package subway.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import subway.station.domain.StationException;

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
    @ValueSource(strings = {"1", "r", "가"})
    public void notInRepository_test(String userInput) {
        assertThatThrownBy(() -> {
            StationException.notInRepository(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
