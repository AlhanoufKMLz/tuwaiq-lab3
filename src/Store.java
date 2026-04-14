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
    public void setUsers(ArrayList<User>  users) {
        this.users = users;
    }

    public void setMedias(ArrayList<Media> medias) {
        this.medias = medias;
    }


    //extra methods
    public void addUser(User user){
        users.add(user);
    }

    public ArrayList<User> displayUsers(){
        return users;
    }

    public void addMedia(Media media){
        medias.add(media);
    }

    public ArrayList<Media> displayMedias(){
        return medias;
    }

    public Book searchBook(String title){
        for(Media m: medias){
            if(m.getTitle().equalsIgnoreCase(title) && m instanceof Book){
                return (Book) m;
            }
        }
        System.out.println("Book \"" + title + "\" not found.");
        return null;
    }


    //to string
    public String toString() {
        return "Store" +
                "\n-users: " + users +
                "\n-medias: " + medias;
    }
}
