package Spring25.Question2;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new FileReader("student.txt"));

            BufferedWriter info = new BufferedWriter(new FileWriter("info.txt"));

            BufferedWriter mark = new BufferedWriter(new FileWriter("mark.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                String[] parts = line.split(" ");

                String id = parts[0];
                String name = parts[1];
                int mark1 = Integer.parseInt(parts[2]);
                int mark2 = Integer.parseInt(parts[3]);

                info.write(id + " " + name);
                info.newLine();

                mark.write(name + " " + (mark1 + mark2));
                mark.newLine();
            }

            br.close();
            info.close();
            mark.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}