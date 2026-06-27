package Summer_23_4_a;

import spring_23_1_b.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<StudentSum23> arrayList = new ArrayList<>();
        arrayList.add(new StudentSum23("Elias",3.5));
        arrayList.add(new StudentSum23("Sourav",3.2));
        arrayList.add(new StudentSum23("Barakat",4.5));
        arrayList.add(new StudentSum23("Bidu",2.5));

        arrayList.remove(1);

        StudentSum23 s3 = new StudentSum23("ali",3.7);

        arrayList.set(2,s3);

        arrayList.add(1,new StudentSum23("Hasil",2.95));

        Collections.sort(arrayList, new Comparator<StudentSum23>() {
            @Override
            public int compare(StudentSum23 o1, StudentSum23 o2) {
                if(o1.getGpa()<o2.getGpa()){
                    return 1;
                }
                return -1;
            }
        });

        double sum=0;
        for(int i=0;i< arrayList.size();i++)
        {
            sum+= arrayList.get(i).getGpa();
        }
        double avg = sum/ arrayList.size();
        System.out.println("Average"+avg);

        for(StudentSum23 p: arrayList)
        {
            System.out.println(p);
        }

    }
}
