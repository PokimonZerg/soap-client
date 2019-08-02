package ru.otus.qa.soap.client;

import org.tempuri.Add;
import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;
import org.tempuri.ObjectFactory;

public class Main {

    public static void main(String[] args) {

        ObjectFactory factory = new ObjectFactory();

        Add addOperation = factory.createAdd();
        addOperation.setIntA(3);
        addOperation.setIntB(5);

        CalculatorSoap calculator = new Calculator().getCalculatorSoap();

        int result = calculator.add(3, 5);
        int i = 0;
    }
}
