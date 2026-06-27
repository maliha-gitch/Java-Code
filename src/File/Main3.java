package File;
import java.io.*;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args)throws Exception{

        File file=new File("student.txt");

        Scanner sc=new Scanner(file);

        while(sc.hasNextLine()){

            System.out.println(sc.nextLine());

        }

        sc.close();

    }

}