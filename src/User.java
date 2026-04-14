import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private ArrayList<Media> purchaseMediaList;
    private ArrayList<Media> shoppingCart;


    //constructor
    public User(){
        this.purchaseMediaList = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public User(String username, String email, ArrayList<Media> purchaseMediaList, ArrayList<Media> shoppingCart) {
        this.username = username;
        this.email = email;
        this.purchaseMediaList = purchaseMediaList;
        this.shoppingCart = shoppingCart;
    }


    //getters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }


    //setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPurchaseMediaList(ArrayList<Media> purchaseMediaList) {
        this.purchaseMediaList = purchaseMediaList;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }


    //extra methods
    public void addToCart(Media media){
        shoppingCart.add(media);
    }

    public void removeFromCart(Media media){
        shoppingCart.remove(media);
    }

    public void checkout(){
        for(int i = 0; i < shoppingCart.size(); i++){
            if(shoppingCart.get(i) instanceof Book){
                ((Book) shoppingCart.get(i)).purchase(this);
            } else if(shoppingCart.get(i) instanceof Movie){
                ((Movie) shoppingCart.get(i)).watch(this);
            } else ((Music) shoppingCart.get(i)).listen(this);
        }
    }


    //to string
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", purchaseMediaList=" + purchaseMediaList +
                ", shoppingCart=" + shoppingCart +
                '}';
    }
}
