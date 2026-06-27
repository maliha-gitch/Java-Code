package fall_23.five_a;

public class Magazine extends ReadingMaterial {


    private int issueNumber;

    public Magazine(String title, String author, int year, int issueNumber) {
        super(title, author, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title" + getTitle() + " "
                + "Author" + getAuthor() + " "
                + "Year" + getYear() + " "
                + "IssueNumber" + issueNumber);

    }
}

