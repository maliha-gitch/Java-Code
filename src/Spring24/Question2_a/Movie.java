package Spring24.Question2_a;

public class Movie {
    public static void main(String[] args) throws InterruptedException {
        MovieTheater m1 = new MovieTheater(15);
        User Mina = new User("Mina",m1,6);
        User Nabil = new User("Nabila",m1,5);
        User Farhan = new User("Farhan",m1,4);

        Mina.start();
        Mina.join();
        Nabil.start();
        Nabil.join();
        Farhan.start();


        Farhan.join();
        System.out.println("Available tickets"+m1.availableSeats);



    }
}
