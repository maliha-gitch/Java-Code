package summer_24_3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("myInputTest.ext"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("myOUtputText.ext"));
            int sum=0;
            int count=0;
            while (true)
            {
                String line;
                line=br.readLine();

                if(line==null) break;
                try {


                    int num = Integer.parseInt(line);
                    num+=sum;
                    count++;


                }catch (NumberFormatException e)
                {
                    System.out.println("Not possible");
                }
            }
            int avg = sum/count;
            bw.write(String.valueOf(avg));
            br.close();
            bw.close();

        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
