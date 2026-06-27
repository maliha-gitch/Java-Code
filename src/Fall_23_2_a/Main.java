package Fall_23_2_a;



import java.io.*;

public class Main {
    public static void main(String[] args) {
        try
        {
            FileReader fr = new FileReader("src/input.txt");
            FileWriter fw = new FileWriter("src/output.txt");
           int i;
           int count = 0;
           while((i = fr.read())!=-1) {
               char ch = Character.toLowerCase((char) i);

               if (Character.isLetter(ch)) {
                   if (ch != 'a' && ch != 'e' &&
                           ch != 'i' && ch != 'o' &&
                           ch != 'u') {
                       count++;
                   }
               }

           }
            System.out.println("Count : "+count);

           fw.write(String.valueOf(count));
           fr.close();
           fw.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }finally {
            System.out.println("FIle processing sucessfully");
        }
    }
}
