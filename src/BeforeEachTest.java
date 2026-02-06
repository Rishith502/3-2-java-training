package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeEachTest {

    int sum;

    @BeforeEach
    void setUp() {
        sum = 0;
        System.out.println("BeforeEach executed");
    }

    @Test
    void testOne() {
        sum += 5;
        System.out.println(sum);
    }

    @Test
    void testTwo() {
        sum += 10;
        System.out.println(sum);
    }
}

