import java.util.ArrayList;

public class Movie extends Media{
    private int duration;


    //constructor
    public Movie(){}

    public Movie(int duration) {
        this.duration = duration;
    }

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }


    //getters
    public int getDuration() {
        return duration;
    }

    //setters
    public void setDuration(int duration) {
        this.duration = duration;
    }

    //extra methods
//    public void watch(User user){
//
//    }
//
//    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog){
//
//    }
//
//    public String getMediaType(){
//
//    }


    //to string
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                '}';
    }
}
