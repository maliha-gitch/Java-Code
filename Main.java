package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList x = new ArrayList<>();
        x.add("string");
        x.add('2');
        x.add(1);
        System.out.println(x.size());
        if(x.contains("1"))
        {
            System.out.println("Contains");
        }
        else {
            System.out.println("Doest not contains");
        }
        x.remove(x.get(0));
        x.set(1,x.get(0));

    }
}
///Output
/*
3
Doest not contains
 */