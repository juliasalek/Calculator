package calculator;


import java.util.*;
/**
 *
 * @author dstudent
 */
public class Main {
    public static void main(String[] args) throws Exception {
        
        String a;
        Ilab ilab=new Lab();
        
        Scanner scanner=new Scanner(System.in);
        do{
            a=scanner.nextLine();
            System.out.println(ilab.calculate(a));
        }
        while(!a.equals("exit") );
        
        
       
    }
}
