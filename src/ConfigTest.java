package org.example;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ConfigTest {

    static String config;

    @BeforeAll
    static void loadConfig() {
        config = "Loaded";
    }

    @Test
    void testConfig() {
        System.out.println(config);
    }
}

