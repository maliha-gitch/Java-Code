package spring_23_5_a;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            list.add(str.charAt(i));
        }
        if(list.size()>=3)
        {
            list.add(2,'z');
        }
        System.out.println(list);
    }
}
