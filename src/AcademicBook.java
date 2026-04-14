import java.util.ArrayList;

public class AcademicBook extends Book{
    private String subject;


    //constructor
    public AcademicBook(){}

    public AcademicBook(String subject) {
        this.subject = subject;
    }

    public AcademicBook(int stock, ArrayList<Review> reviews, String subject) {
        super(stock, reviews);
        this.subject = subject;
    }

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> reviews, String subject) {
        super(title, auteur, ISBN, price, stock, reviews);
        this.subject = subject;
    }


    //getters
    public String getSubject() {
        return subject;
    }


    //setters
    public void setSubject(String genre) {
        this.subject = subject;
    }


    //extra methods
    public String getMediaType(){
        if(isBestSeller()) return "Bestselling AcademicBook";
        return "AcademicBook";
    }


    //to string
    public String toString() {
        return "Novel{" +
                "subject='" + subject + '\'' +
                '}';
    }

}
