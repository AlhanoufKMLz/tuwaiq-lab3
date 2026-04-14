public class Media {
    private String title;
    private String author;
    private String ISBN;
    private double price;

    //constructor
    public Media(){
    }
    public Media(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }


    //getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getPrice() {
        return price;
    }


    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //extra methods
    public String getMediaType(){
        return "Media";
    }


    //to string
    public String toString() {
        return "   * title: " + title +
                " ,author: " + author +
                " ,ISBN: " + ISBN +
                " ,price: " + price;
    }
}
