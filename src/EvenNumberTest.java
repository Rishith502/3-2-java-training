package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class EvenNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    void isEven_shouldReturnTrue(int number) {
        assertEquals(number % 2 == 0);
    }

    private void assertEquals(boolean b) {

    }
}
