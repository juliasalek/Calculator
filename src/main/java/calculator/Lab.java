package calculator;

import java.util.regex.Pattern;

//TODO ulepszenie do operacji na kilku liczb
public class Lab implements Ilab {


    public double calculate(String str) throws Exception {

        String[] stringArray = str.split("");
        String number1 = "";
        String number2 = "";
        String sign = "";
        int index = 0;

        for (String a: stringArray) {
            if (Pattern.matches("[0-9.]", a)) {
                if (index == 0) {
                    number1 += a;
                }
                else {
                    number2+=a;
                }
            }
            else if (Pattern.matches(" ", a)){
                throw new Exception();
            }
            else if (Pattern.matches("[a-zA-Z]", a)) {

            } else if(Pattern.matches("[+/*-]", a)){
                sign = a;
                index++;
            }
        }


        if(sign.equals("+")) {
            return Double.parseDouble(number1) + Double.parseDouble(number2);
        }
        
        if(sign.equals("-")) {
            return Double.parseDouble(number1) - Double.parseDouble(number2);
        }
        
        if(sign.equals("*")) {
            return Double.parseDouble(number1) * Double.parseDouble(number2) ;
        }
        
        if(sign.equals("/")) {
            return Double.parseDouble(number1) / Double.parseDouble(number2);
        }

            return 0;  //score
        }


}
