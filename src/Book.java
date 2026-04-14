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

    public ArrayList<Review> getReviews() {
        return reviews;
    }


    //setters
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }


    //extra methods
    public void addReview(Review r) {
        reviews.add(r);
    }

    public double getAverageRating(){
        if(reviews.isEmpty()) return 0;
        int totalRatings = 0;
        for(Review r: reviews){
            totalRatings += r.getRating();
        }
        return (double) totalRatings / reviews.size();
    }

    public void purchase(User user){
        if(stock == 0) {
            System.out.println("sorry, the book " + this.getTitle() + "is out of stock!");
            return;
        }
        user.getPurchaseMediaList().add(this);
        stock--;
    }

    public boolean isBestSeller(){
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity){
        if(quantity < 0) {
            System.out.println("Restock quantity must be positive number.");
            return;
        }
        stock += quantity;
        System.out.println("The stock is updated. \nAvailable stock: " + stock);
    }

    public String getMediaType(){
        if(isBestSeller()) return "Bestselling Book";
        return "Book";
    }


    //to string
    public String toString() {
        return super.toString() +
                " ,stock: " + stock +
                " ,reviews: " + reviews;
    }
}

