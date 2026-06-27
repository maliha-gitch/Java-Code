package Spring24.Question2_a;

public class MovieTheater {
    int availableSeats;
    MovieTheater(int s)
    {
        availableSeats = s;
    }
 public synchronized int bookTickets( int numOFseats )
 {

     int numOfTicketsBooked = 0;
     for(int i=1;i<=numOFseats;i++)
     {
         if(availableSeats>0)
         {
             availableSeats--;
             numOfTicketsBooked++;
         }
     }
     return numOfTicketsBooked;
 }
}
