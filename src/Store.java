import java.util.ArrayList;

public class Store {
    private ArrayList<User> users;
    private ArrayList<Media> medias;


    //constructor
    public Store(ArrayList<User>  users, ArrayList<Media> medias) {
        this.users = users;
        this.medias = medias;
    }


    //getters
    public ArrayList<User>  getUser() {
        return users;
    }

    public ArrayList<Media> getMedia() {
        return medias;
    }


    //setters
    public void setUser(ArrayList<User>  users) {
        this.users = users;
    }

    public void setMedia(ArrayList<Media> medias) {
        this.medias = medias;
    }


    //extra methods
//    public void AddUser(User user){
//        users.add(user);
//    }
//
//    public ArrayList<User> displayUsers(){
//
//    }
//
//    public void AddMedia(Media media){
//        medias.add(media);
//    }
//
//    public ArrayList<Media> displayMedias(){
//
//    }
//
//    public Book searchBook(String title){}


    //to string
    public String toString() {
        return "Store{" +
                "users=" + users +
                ", medias=" + medias +
                '}';
    }
}
