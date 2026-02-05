package org.example;

//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class CalculatorTest {
//    @Test
//    void testAddPositiveNumbers(){
//        Calculator calculator=new Calculator();
//        assertEquals(10,calculator.add(5,5));
//    }
//
//    void testAddNegativeNumbers() {
//        Calculator calculator=new Calculator();
//        assertEuals(10,calculator.add(10,5));
//    }
//}

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calc.add(4, 6));
        assertEquals(-2, calc.add(3, -5));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calc.subtract(5, 3));
        assertEquals(-8, calc.subtract(-5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calc.multiply(3, 5));
        assertEquals(0, calc.multiply(0, 100));
    }

    @Test
    void testDivision() {
        assertEquals(2.5, calc.divide(5, 2));
        assertEquals(-3.0, calc.divide(9, -3));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });
    }
}

