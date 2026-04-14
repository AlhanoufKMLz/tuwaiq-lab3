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
        if (shoppingCart.contains(media)) {
            shoppingCart.remove(media);
            System.out.println("\"" + media.getTitle() + "\" removed from cart.");
        } else {
            System.out.println("\"" + media.getTitle() + "\" is not in your cart.");
        }
    }

    public void checkout(){
        if (shoppingCart.isEmpty()) {
            System.out.println("Your cart is empty!");
            return;
        }

        for(Media m: shoppingCart){
            if(m instanceof Book){
                ((Book) m).purchase(this);
            } else if(m instanceof Movie){
                ((Movie) m).watch(this);
            } else ((Music) m).listen(this);
        }
        shoppingCart.clear();
    }


    //to string
    public String toString() {
        String purchase = "";
        for (Media m : purchaseMediaList) {
            purchase += m.toString() + "\n";
        }
        String cart = "";
        for (Media m : shoppingCart) {
            cart += m.toString() + "\n";
        }
        return
                "-username: " + username +
                "\n-email: " + email +
                "\n-purchaseMediaList: \n" + (purchase.isEmpty() ? "No media" : purchase) +
                "\n-shoppingCart: \n" + (cart.isEmpty() ? "No media" : cart);
    }
}
