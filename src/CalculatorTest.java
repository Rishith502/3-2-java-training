package org.example;

<<<<<<< HEAD
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
=======
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
>>>>>>> f2b5e1f984f7e9e8d09d19624960a5a4316efbdf
    }

    @Test
    void testSubtraction() {
<<<<<<< HEAD
        assertEquals(1, calculator.subtract(3, 2));
=======
        assertEquals(2, calc.subtract(5, 3));
        assertEquals(-8, calc.subtract(-5, 3));
>>>>>>> f2b5e1f984f7e9e8d09d19624960a5a4316efbdf
    }

    @Test
    void testMultiplication() {
<<<<<<< HEAD
        assertEquals(6, calculator.multiply(2, 3));
=======
        assertEquals(15, calc.multiply(3, 5));
        assertEquals(0, calc.multiply(0, 100));
>>>>>>> f2b5e1f984f7e9e8d09d19624960a5a4316efbdf
    }

    @Test
    void testDivision() {
<<<<<<< HEAD
        assertEquals(2, calculator.divide(4, 2));
=======
        assertEquals(2.5, calc.divide(5, 2));
        assertEquals(-3.0, calc.divide(9, -3));
>>>>>>> f2b5e1f984f7e9e8d09d19624960a5a4316efbdf
    }

    @Test
    void testDivisionByZero() {
<<<<<<< HEAD
        assertThrows(ArithmeticException.class,
                () -> calculator.divide(5, 0));
    }
}
=======
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });
    }
}

>>>>>>> f2b5e1f984f7e9e8d09d19624960a5a4316efbdf
