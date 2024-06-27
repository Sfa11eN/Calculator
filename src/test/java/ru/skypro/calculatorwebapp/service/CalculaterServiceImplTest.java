package ru.skypro.calculatorwebapp.service;

import org.junit.jupiter.api.Test;
import ru.skypro.calculatorwebapp.exception.ZeroDivideException;

import static org.junit.jupiter.api.Assertions.*;
import static ru.skypro.calculatorwebapp.CalculatorConstants.*;

class CalculaterServiceImplTest {
    private CalculaterServiceImpl service=new CalculaterServiceImpl();

    @Test
    void sum() {
        assertEquals(THREE+SEVEN,service.sum(THREE,SEVEN));
    }
    @Test
    void sum2() {
        assertEquals(TWO + TWO, service.sum(TWO, TWO));
    }

    @Test
    void substract() {
        assertEquals(NINE - FIVE, service.substract(NINE, FIVE));
    }

    @Test
    void multiply() {
        assertEquals(THREE * FOUR, service.multiply(THREE, FOUR));
    }

    @Test
    void divide() {
        assertEquals(SIX / TWO, service.divide(SIX, TWO));
    }
    @Test
    void ThrowZeroDivideException(){
        assertThrows(ZeroDivideException.class,()->service.divide(THREE,ZERO));
    }
}