import java.util.ArrayList;

public class Book extends Media{
    private int stock;
    private ArrayList<Review> reviews;


    //constructor
    public Book() {
        this.reviews = new ArrayList<>();
    }

    public Book(int stock, ArrayList<Review> reviews) {
        this.stock = stock;
        this.reviews = reviews;
    }

    public Book(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> reviews) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = reviews;
    }


    //getters
    public int getStock() {
        return stock;
    }

    public ArrayList<Review> getReview() {
        return reviews;
    }


    //setters
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setReview(ArrayList<Review> review) {
        this.reviews = review;
    }


    //extra methods
    public void addReview(Review r) {
        reviews.add(r);
    }

    public double getAverageRating(){
        int totalRatings = 0;
        for(int i = 0; i < reviews.size(); i++){
            totalRatings += reviews.get(i).getRating();
        }
        return totalRatings / reviews.size();
    }

    public void purchase(User user){
        user.getPurchaseMediaList().add(this);
        stock--;
    }

    public boolean isBestSeller(){
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity){
        stock += quantity;
        System.out.println("The stuck is updated. \nAvailable stock: " + stock);
    }

    public String getMediaType(){
        if(isBestSeller()) return "Bestselling Book";
        return "Book";
    }


    //to string
    public String toString() {
        return "Book{" +
                "stock=" + stock +
                ", reviews=" + reviews +
                '}';
    }
}

