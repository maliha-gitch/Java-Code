package fall_23.five_a;

public class Book extends ReadingMaterial {
    private String genre;
    public Book(String title,String author,int year,String genre){
        super(title,author,year);
        this.genre=genre;
    }
    @Override
    public void displayDetails() {
        System.out.println("Title"+getTitle()+" "
        +"Author"+getAuthor()+" "
        +"Year"+getYear()+" "
        +"Genre"+genre);

    }
}
