package Summer_23_2_a;

import java.util.ArrayList;
import java.util.List;
class Book {
    String title;
    String author;
    int numberOfAvailableCopies;

    public Book(String title, String author, int numberOfAvailableCopies) {
        this.title = title;
        this.author = author;
        this.numberOfAvailableCopies = numberOfAvailableCopies;
    }


    void buyBook() throws BuyBookException {
       if(numberOfAvailableCopies<0)
       {
           throw new BuyBookException("BookOutOfStock");
       }
       numberOfAvailableCopies=numberOfAvailableCopies-1;
    }
}