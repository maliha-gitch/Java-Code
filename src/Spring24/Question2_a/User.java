package Spring24.Question2_a;

public class User extends Thread{
    MovieTheater m;
    int NumOfTickets;
    User(String name,MovieTheater m,int NumOfTickets)
    {
        super(name);
        this.m = m;
        this.NumOfTickets = NumOfTickets;
    }
    public void  run()
    {
        int booked = m.bookTickets(NumOfTickets);
        System.out.println(getName()+"has booked"+booked+"tickets");

    }
}
