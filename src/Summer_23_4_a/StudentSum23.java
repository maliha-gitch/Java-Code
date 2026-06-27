package Summer_23_4_a;

public class StudentSum23 {
    private double gpa;
    private String name;
    StudentSum23(String name,double gpa)
    {

        this.name=name;
        this.gpa=gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString()
    {
        return "Name"+name+"GPA"+gpa;
    }

}
