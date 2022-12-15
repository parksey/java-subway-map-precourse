package subway.view;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
public class InputExceptionTest {
    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    public void null_test(String userInput) {
        assertThatThrownBy(()-> {
            InputException.nullException(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "B"})
    public void notMainFunction_test(String userInput) {
        assertThatThrownBy(()-> {
            InputException.notMainFunction(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "Q"})
    public void notStationFunction_test(String userInput) {
        assertThatThrownBy(()-> {
            InputException.notStationFunction(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
