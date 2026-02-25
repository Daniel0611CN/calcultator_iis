package org.iis.janebro;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(15, calculator.add(10,5), "10 + 5 should equal 15");
    }

    @Test
    void testSubstract() {
        assertEquals(12, calculator.substract(20,8), "20 - 8 should equal 12");
    }

    @Test
    void testMultiply() {
        assertEquals(20, calculator.multiply(5,4), "5 * 4 should equal 20");
    }

    @Test
    void testDivide() {
        assertEquals(50, calculator.divide(250,5), "250 / 5 should equal 50");
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class,() -> calculator.divide(3,0), "Dividing by zero should throw IllegalArgumentException");
    }

}
