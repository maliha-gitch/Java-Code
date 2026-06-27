package spring_23_3;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Employee [] emp = new Employee[n];
        System.out.println("Enter the employee information");
        try{
            FileWriter fw = new FileWriter("employee.txt");

            for(int i=0;i<n;i++)
            {
                emp[i] = new Employee();
               emp[i].name = scanner.nextLine();
               emp[i].id = scanner.nextLine();


               double sum=0;
                for(int j=1;j<=6;j++)
                {
                     sum = sum+ scanner.nextDouble();

                }
                scanner.nextLine();
                emp[i].average=sum/6;
                fw.write(emp[i].name+"\n");
                fw.write(emp[i].id+"\n");
                fw.write(emp[i].average+"\n");
            }
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader("employee.txt"));
            FileWriter fk = new FileWriter("increment.txt");
            String line;
            while ((line=br.readLine())!=null){
                String id = br.readLine();
                double avg = Double.parseDouble(br.readLine());
                if(avg>75)
                {
                    fk.write(line);
                }

            }
            fk.close();
            double max = emp[0].average;

            for(int i=0;i<n;i++)
            {
                if(emp[i].average<max)
                {
                    max=emp[i].average;

                }
            }
            for(int i=0;i<n;i++)
            {
                if(emp[i].average==max)
                {
                    System.out.println("Name"+emp[i].name+"Average"+emp[i].average);

                }
            }
            br.close();


        }catch (IOException e)
        {
            System.out.println("File not found");
        }

    }
}
