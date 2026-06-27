package ArrayList;

public class Student implements Comparable<Student> {
    int id;
    String name;
    double cgpa;
    Student(int id,String name,double cgpa)
    {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }


    public  int compareTo(Student s)
    {
        if(this.id>s.id)
        {
            return 1;
        }
        else if(this.id<s.id)
        {
            return -1;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Id : "+id+" Name : "+name+" CGPA : "+cgpa;
    }


}
