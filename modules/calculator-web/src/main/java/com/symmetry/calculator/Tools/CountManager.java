package com.symmetry.calculator.Tools;

public class CountManager {

    private Long number1;
    private Long number2;
    private Long result;
    private String typeOfEquation;


    public CountManager(Long number1, Long number2, String typeOfEquation) {
        this.number1 = number1;
        this.number2 = number2;
        this.typeOfEquation = typeOfEquation;
    }

    public Long getResult() {
        countResult();
        return result;
    }

    private void countResult() {
        if(typeOfEquation.equals(ListOfOperation.ADDITION)) result=number1+number2;
        else if(typeOfEquation.equals(ListOfOperation.DIVISION)) result=number1-number2;
        else if(typeOfEquation.equals(ListOfOperation.MULTIPLICATION)) result=number1*number2;
        else if(typeOfEquation.equals(ListOfOperation.DIVISION)) result=number1/number2;
    }
}
