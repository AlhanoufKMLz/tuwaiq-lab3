import java.util.ArrayList;

public class Novel extends Book{
    private String genre;


    //constructor
    public Novel(){}

    public Novel(String genre) {
        this.genre = genre;
    }

    public Novel(int stock, ArrayList<Review> reviews, String genre) {
        super(stock, reviews);
        this.genre = genre;
    }

    public Novel(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> reviews, String genre) {
        super(title, auteur, ISBN, price, stock, reviews);
        this.genre = genre;
    }


    //getters
    public String getGenre() {
        return genre;
    }


    //setters
    public void setGenre(String genre) {
        this.genre = genre;
    }


    //extra methods
//    public String getMediaType(){
//
//    }


    //to string
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
