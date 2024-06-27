package ru.skypro.calculatorwebapp.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.skypro.calculatorwebapp.exception.ZeroDivideException;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static ru.skypro.calculatorwebapp.CalculatorConstants.*;

class CalculaterServiceImplParamTest {
    private final CalculaterServiceImpl service = new CalculaterServiceImpl();
    @ParameterizedTest
    @MethodSource("provideParams")
    void sum(int num1,int num2) {
        assertEquals(num1 + num2, service.sum(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void substract(int num1,int num2) {
        assertEquals(num1 - num2, service.substract(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void multiply(int num1,int num2) {
        assertEquals(num1 * num2, service.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void divide(int num1,int num2) {
        assertEquals(num1 / num2, service.divide(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void ThrowZeroDivideException(int num1,int num2) {
        assertThrows(ZeroDivideException.class, () -> service.divide(num1, num2));
    }

    private static Stream<Arguments> provideParams() {
        return Stream.of(
                Arguments.of(ZERO, ONE),
                Arguments.of(ONE, ONE),
                Arguments.of(THREE, ONE),
                Arguments.of(TWO, TWO),
                Arguments.of(THREE, THREE)
        );

        }
    }
