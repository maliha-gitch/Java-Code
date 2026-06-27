package summer_24_2;

public class Student5 {
    int id;
    String name;
    double gpa;

    public Student5(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;

    }

    @Override
    public String toString() {
        return "id: "+id+"name: "+name+"gpa: "+gpa;
    }
}