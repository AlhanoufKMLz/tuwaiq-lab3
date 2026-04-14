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
    public void watch(User user){
        user.getPurchaseMediaList().add(this);
    }

    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog){
        ArrayList<Movie> recommended = new ArrayList<>();
        for(Movie m: movieCatalog){
            if(m.getAuthor().equalsIgnoreCase(super.getAuthor()) && m != this)
                recommended.add(m);
        }
        return recommended;
    }

    public String getMediaType(){
        if(duration >= 120) return "Long Movie";
        return "Movie";
    }


    //to string
    public String toString() {
        return super.toString() +
                " ,duration: " + duration;
    }
}
