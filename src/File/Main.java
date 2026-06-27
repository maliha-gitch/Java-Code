package File;

import java.io.FileReader;
/// এটা Character Read করে।

public class Main {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("student.txt");
            int i;
            while((i=fr.read())!=-1)
            {
                System.out.println((char)i);
            }
            fr.close();
        }catch (Exception e)
        {
            System.out.println("Not found");
        }


    }
}
