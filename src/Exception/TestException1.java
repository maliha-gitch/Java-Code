package Exception;

import java.util.Scanner;

public class TestException1 {
    public static void main(String[] args) {
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter an interger between 1 and 100: ");
            int num=scan.nextInt();
            if(num<1 || num>100)
            {
                throw new OutOfRangeException("OutofException : Number must be between 1 and 100: ");

            }
            System.out.println("You entered: "+num);
        }catch (OutOfRangeException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Eror : "+e.getMessage());
        }
    }
}
