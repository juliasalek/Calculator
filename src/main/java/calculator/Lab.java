package calculator;
//TODO ulepszenie do operacji na kilku liczb
import java.util.*;
import java.util.regex.Pattern;
public class Lab implements Ilab {

    public double calculate(String str)  {
        String[] stringArray = str.split("");
        String n1 = "";
        String n2 = "";
        String sign = "";
        int index = 0;

        for (String a: stringArray) {
            if (Pattern.matches("[0-9.]", a)) {
                if (index == 0) {
                    n1 += a;
                }
                else {
                    n2+=a;
                }
            }
            else if (Pattern.matches(" ", a)){}
            else if (Pattern.matches("[a-zA-Z]", a)) {
                //throw Exception;
            } else if(Pattern.matches("[+/*-]", a)){
                sign = a;
                index++;
            }
        }
        System.out.println(n1 + "<N1 n2>"+n2+"<>"+sign);


        if(sign.equals("+"))
        {
            return Double.parseDouble(n1) + Double.parseDouble(n2);
        }
        
        else if(sign.equals("-"))
        {
            return Double.parseDouble(n1) - Double.parseDouble(n2);
        }
        
        else if(sign.equals("*"))
        {
            return Double.parseDouble(n1) * Double.parseDouble(n2) ;
        }
        
        else if(sign.equals("/"))
        {
            return Double.parseDouble(n1) / Double.parseDouble(n2);
        }

            return 0;  //score
        }


}
