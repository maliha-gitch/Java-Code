package Hashset;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet <Integer> a = new HashSet<>();
        a.add(33);
        a.add(11);
        a.add(33);
        for(int i:a)
        {
            System.out.println(i);
        }
        System.out.println(a.size());
        if (a.contains(3)) {
            System.out.println("COntains");
        }
    }
}
///Output
/*
33
11
2
 */