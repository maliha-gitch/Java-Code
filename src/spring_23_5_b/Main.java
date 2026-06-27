package spring_23_5_b;

import spring_23_1_b.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> arrayList = new ArrayList<>();
      arrayList.add(new Point(3,4));
        arrayList.add(new Point(5,6));
        arrayList.add(new Point(0,8));
        Collections.sort(arrayList, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int sum=o1.x+o1.y;
                int sum2=o2.x+o2.y;
                if(sum<sum2){
                    return 1;
                }
                return -1;
            }
        });
        for(Point p:arrayList)
        {
            System.out.println(p);
        }
    }
}
