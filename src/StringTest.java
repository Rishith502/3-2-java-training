import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;

class StringTest {

    @ParameterizedTest
    @ValueSource(strings = {"Java", "JUnit", "Test"})
    void stringShouldNotBeEmpty(String value) {
        assertFalse(value.isEmpty());
    }
}
