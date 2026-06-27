package summer_24_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Student5> arrayList = new ArrayList<>();
        Student5 s1=new Student5(101,"Hasibul Islam",3.75);
        arrayList.add(s1);
        Student5 s3=new Student5(102,"Mitu Rahman",3.90);

        arrayList.add(s3);
        arrayList.add(new Student5(103,"Fahim Khan",3.40));
        arrayList.add(new Student5(104,"Nusrat Jahan",3.85));
        arrayList.add(new Student5(105,"Aminul Haque",3.55));
        arrayList.add(new Student5(106,"Sumaiya Chowdhury",3.78));
        System.out.println("Before swaping");
        for(Student5 s:arrayList)
        {
            System.out.println(s);
        }
        System.out.println("After swaping");
        arrayList.set(1,s1);
        arrayList.set(0,s3);
        for(Student5 s:arrayList)
        {
            System.out.println(s);
        }
    }
}
