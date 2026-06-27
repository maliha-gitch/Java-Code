package Summer_23.Question_1;

public class UG_SuperStudent extends Student implements TA,RA {
    String Professor;
    String research;
    int salary;


    @Override
    void register() {
        System.out.println("Registered to the assigned courses");
    }

    @Override
    void display() {
        System.out.println("Student First-Name: "+firstName);
        System.out.println("Student Second-Name: "+lastName);
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Age: "+age);

        System.out.println("Professor: " + Professor);
        System.out.println("Research: " + research);
        System.out.println("Salary: " + salary);

    }


    @Override
    public void conductReasearch() {
        System.out.println("Conducting Reasearch"+research);
    }

    @Override
    public void assistProfessor() {
        System.out.println("Assisting Professor"+Professor);
    }
}
