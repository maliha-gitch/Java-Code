package Summer_23_2_b;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        File f1 = new File("input.txt");
        File f2 = new File("output.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f1));
            FileWriter fr = new FileWriter(f2);

            while (true)
            {
                String line= br.readLine(); ;
               if(line==null)
               {
                   break;
               }
               int num1=Integer.parseInt(line);
               int num2=Integer.parseInt(br.readLine());
               int sum=num1+num2;
               fr.write(String.valueOf(sum));

            }
            br.close();
            fr.close();

        }catch (IOException e)
        {
            System.out.println("File not found");
        }


    }
}
