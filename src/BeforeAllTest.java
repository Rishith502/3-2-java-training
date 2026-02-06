package org.example;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BeforeAllTest {

    @BeforeAll
    static void initAll() {
        System.out.println("BeforeAll executed ONCE");
    }

    @Test
    void testOne() {
        System.out.println("Test 1");
    }

    @Test
    void testTwo() {
        System.out.println("Test 2");
    }
}

