import java.util.ArrayList;

public class Music extends Media{
    private String artist;

    //constructor
    public Music(){}

    public Music(String artist) {
        this.artist = artist;
    }

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }


    //getters
    public String getArtist() {
        return artist;
    }


    //setters
    public void setArtist(String artist) {
        this.artist = artist;
    }


    //extra methods
    public void listen(User user){
        user.getPurchaseMediaList().add(this);
    }

    public ArrayList<Music> generatePlaylist(ArrayList<Music> musicCatalog){
        ArrayList<Music> playlist = new ArrayList<>();
        for(int i = 0; i < musicCatalog.size(); i++){
            if(musicCatalog.get(i).getAuthor().equalsIgnoreCase(super.getAuthor()))
                playlist.add(musicCatalog.get(i));
        }
        return playlist;
    }

    public String getMediaType(){
        if(super.getPrice() >= 10) return "Premium Music";
        return "Music";
    }

    //to string
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' +
                '}';
    }
}
