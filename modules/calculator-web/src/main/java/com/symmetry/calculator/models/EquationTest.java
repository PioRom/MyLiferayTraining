package com.symmetry.calculator.models;

public class EquationTest {

    private Integer number1;
    private Integer number2;
    private Integer typeOfEquation;
    private Integer result;

    public EquationTest(Integer number1, Integer number2, Integer typeOfEquation, Integer result) {
        this.number1 = number1;
        this.number2 = number2;
        this.typeOfEquation = typeOfEquation;
        this.result = result;
    }

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

    public Integer getTypeOfEquation() {
        return typeOfEquation;
    }

    public void setTypeOfEquation(Integer typeOfEquation) {
        this.typeOfEquation = typeOfEquation;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}

