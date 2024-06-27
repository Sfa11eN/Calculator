package ru.skypro.calculatorwebapp.service;

import org.springframework.stereotype.Service;
import ru.skypro.calculatorwebapp.exception.ZeroDivideException;

@Service

public class CalculaterServiceImpl  implements CalculatorService{
    @Override
    public int sum(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1-num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public float divide(int num1, int num2) {
        if (num2==0){
            throw new ZeroDivideException();
        }
        return num1/num2;
    }
}
