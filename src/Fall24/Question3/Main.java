package Fall24.Question3;

import Fall24.Question1.B;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            String line;
            while ((line = br.readLine())!=null){
                for(int i=0;i<line.length();i++)
                {
                    char ch = line.charAt(i);
                    if(Character.isDigit(ch)){
                        bw.write(ch);
                    }
                }
            }
            br.close();
            bw.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
