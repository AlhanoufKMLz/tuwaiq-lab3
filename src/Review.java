public class Review {
    private String username;
    private int rating;
    private String comment;


    //constructor
    public Review(){}

    public Review(String username, int rating, String comment) {
        this.username = username;
        this.rating = rating;
        this.comment = comment;
    }

    //getters
    public String getUsername() {
        return username;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }


    //setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    //to string
    public String toString() {
        return "Review{" +
                "username='" + username + '\'' +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }
}
