package com.juad.calc;

import java.util.regex.*;

class Lab {

    static Double calculate(String str) {

        String[] stringArray = str.split("");
        String firstNumber = "";
        String secondNumber = "";
        String sign = "";
        int index = 0;

        for (String a: stringArray) {
            if (Pattern.matches("[0-9.]", a)) {
                if (index == 0) {
                    firstNumber += a;
                }
                else {
                    secondNumber += a;
                }
            }
            else if (Pattern.matches(" ", a)){

            }
            else if (Pattern.matches("[a-zA-Z]", a)) {

            } else if(Pattern.matches("[+/*-]", a)){
                sign = a;
                index++;
            }
        }


        if(sign.equals("+")) {
            return Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
        }
        else if(sign.equals("-")) {
            return Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
        }
        else if(sign.equals("*")) {
            return Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber) ;
        }
        else if(sign.equals("/")) {
            return Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
        }

        return 0.0;  //score
    }
}
