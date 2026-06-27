package Exception;

import java.util.Scanner;

public class JavaExample {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter the num1 : ");
        num1=scan.nextInt();
        System.out.print("Enter the num1 : ");
        num2=scan.nextInt();
        int div ;
        try
        {
             div = num1/num2;
            System.out.println("Result : "+div);
        }catch (ArithmeticException e)
        {
            System.out.println("DO not enter num2 zero value");
        }
        



    }
}
