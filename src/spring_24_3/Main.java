package spring_24_3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("src/input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/output.txt"));
            String line;
            int minValue = Integer.MAX_VALUE;

                while(true){
                    try {
                        line = br.readLine();
                        if(line==null) break;
                        int value = Integer.parseInt(line);
                        if(minValue>value)
                        {
                            minValue = value;
                        }


                    }catch (NumberFormatException ignored)
                    {
                        System.out.println("Invaild format");
                    }

                }
            System.out.println("Min value : "+minValue);
                bw.write(minValue);
                bw.close();
                br.close();



        }catch (FileNotFoundException e)
        {
            System.out.println("Not found file");
        } catch (IOException e) {
            System.out.println("not found");
        }
        finally {
            System.out.println("FIle processing complete");
        }
    }
}
