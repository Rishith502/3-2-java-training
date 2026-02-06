package org.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoginTest {

    @ParameterizedTest
    @CsvSource({
            "admin, admin123, true",
            "user, wrongpass, false"
    })
    void validateLogin(String username, String password, boolean expected) {
        boolean result = username.equals("admin") && password.equals("admin123");
        assertEquals(expected, result);
    }
}
