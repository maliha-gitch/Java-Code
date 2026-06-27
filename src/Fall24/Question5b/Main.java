package Fall24.Question5b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        ArrayList<Cow> cows = new ArrayList<>();
        cows.add(new Cow("Raja Babu", 2700000));
        cows.add(new Cow("Hero Alom", 1500000));
        cows.add(new Cow("Sultan", 1800000));
        cows.add(new Cow("Minister", 1200000));
        cows.add(new Cow("Shahid", 2200000));
        System.out.println("Before Sorting:");
        for (Cow c : cows) {
            System.out.println(c);
        }

        Collections.sort(cows);

        System.out.println("\nAfter Sorting by Price:");
        for (Cow c : cows) {
            System.out.println(c);
        }
        Collections.sort(cows, new NameComparator());
        System.out.println("\nAfter Sorting by Name:");
        for (Cow c : cows) {
            System.out.println(c);
        }


    }
}