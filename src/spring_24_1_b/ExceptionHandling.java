package spring_24_1_b;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] myArray = new int[n];
        try
        {
            int index = scan.nextInt();
            int value = scan.nextInt();
             myArray[index] = value;
            System.out.println("Value Insert Successfully");
        }catch (ArrayIndexOutOfBoundsException e)
        {

            System.out.println("ArrayIndexOutOfBoundsException occured");
        }catch (InputMismatchException e)
        {
            System.out.println("InputMismatchException occured ");
        } catch (Exception e) {
            System.out.println("Some other exception occured");
        }finally {
            System.out.println("Exception handling is amazing");
        }
    }
}
