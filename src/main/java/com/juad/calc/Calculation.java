package com.juad.calc;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Calculation {

    private @Id @GeneratedValue Long id;
    private String sign;
    private String firstNumber;
    private String secondNumber;
    private String result;

    Calculation(String sign, String firstNumber, String secondNumber) {
        this.sign = sign;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    String getFormula() {
        return this.firstNumber + this.sign + this.secondNumber;
    }
}
