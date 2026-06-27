package File;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main2 {
    public static void main(String[] args) {
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("student.txt"));
            String line;
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
