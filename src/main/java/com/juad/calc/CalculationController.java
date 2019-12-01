package com.juad.calc;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculationController {

    @PostMapping("/calculator")
    Double calculate(@RequestBody Calculation calculation) throws Exception {
        if (calculation.getSign().equalsIgnoreCase("/") &&
                calculation.getSecondNumber().equalsIgnoreCase("0")) {
            throw new DivideByZeroException("Dont divide by zero!");
        }
        return Lab.calculate(calculation.getFormula());
    }
}
