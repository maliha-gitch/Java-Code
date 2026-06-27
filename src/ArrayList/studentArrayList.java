package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class studentArrayList {
    public static void main(String[] args) {
        ArrayList <Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student(5,"maliha",3.55));
        studentArrayList.add(new Student(9,"mina",3.56));
        studentArrayList.add(new Student(7,"kalil",3.67));

        for(Student s:studentArrayList)
        {
            System.out.println(s);
        }


        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1,Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        for(Student s:studentArrayList)
        {
            System.out.println(s);
        }


        Collections.sort(studentArrayList);

        for(Student s:studentArrayList)
        {
            System.out.println(s);
        }
        studentArrayList.remove(studentArrayList.get(1));
        studentArrayList.set(1,studentArrayList.get(2));

    }
}
///Output
/*
Id : 5 Name : maliha CGPA : 3.55
Id : 9 Name : mina CGPA : 3.56
Id : 7 Name : kalil CGPA : 3.67

 */

///After Sorting by name

 /*
Id : 7 Name : kalil CGPA : 3.67
Id : 5 Name : maliha CGPA : 3.55
Id : 9 Name : mina CGPA : 3.56

 */

///After Sorting by id

 /*
Id : 5 Name : maliha CGPA : 3.55
Id : 7 Name : kalil CGPA : 3.67
Id : 9 Name : mina CGPA : 3.56

 */