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
    public void AddUser(User user){
        users.add(user);
    }

    public ArrayList<User> displayUsers(){
        return users;
    }

    public void AddMedia(Media media){
        medias.add(media);
    }

    public ArrayList<Media> displayMedias(){
        return medias;
    }

    public Book searchBook(String title){
        for(int i = 0; i < medias.size(); i++){
            if(medias.get(i).getTitle().equalsIgnoreCase(title) && medias.get(i) instanceof Book){
                return (Book) medias.get(i);
            }
        }
        return null;
    }


    //to string
    public String toString() {
        return "Store{" +
                "users=" + users +
                ", medias=" + medias +
                '}';
    }
}
