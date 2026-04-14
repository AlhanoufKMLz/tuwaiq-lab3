//Alhanouf Allazzam

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //---------Objects---------
        // Reviews
        Review review1 = new Review("Alhanouf", 5, "Absolutely loved it, couldn't put it down!");
        Review review2 = new Review("Sara", 3, "Decent read, but a bit slow in the middle.");
        Review review3 = new Review("Rahaf", 1, "Very disappointing, not what I expected.");
        Review review4 = new Review("Reema", 5, "A masterpiece, highly recommend!");

        // Books
        Book book1 = new Book("Atomic Habits", "James Clear", "978-0735211292", 45, 20, new ArrayList<>(List.of(review1, review2)));
        Book book2 = new Book("Deep Work", "Cal Newport", "978-1455586691", 40, 15, new ArrayList<>());

        Novel novel1 = new Novel("The Alchemist", "Paulo Coelho", "978-0062315007", 35, 30, new ArrayList<>(List.of(review3, review4)), "Adventure");
        Novel novel2 = new Novel("1984", "George Orwell", "978-0451524935", 30, 25, new ArrayList<>(), "Dystopian");

        AcademicBook academicBook1 = new AcademicBook("Introduction to Algorithms", "Thomas H. Cormen", "978-0262033848", 120, 8, new ArrayList<>(List.of(review1, review4)), "Computer Science");
        AcademicBook academicBook2 = new AcademicBook("Calculus: Early Transcendentals", "James Stewart", "978-1285741550", 95, 5, new ArrayList<>(), "Mathematics");

        // Movies
        Movie movie1 = new Movie("Inception", "Christopher Nolan", "978-1234500001", 25, 148);
        Movie movie2 = new Movie("Interstellar", "Christopher Nolan", "978-1234500002", 25, 169);
        Movie movie3 = new Movie("The Dark Knight", "Christopher Nolan", "978-1234500003", 20, 152);
        Movie movie4 = new Movie("Parasite", "Bong Joon-ho", "978-1234500004", 20, 132);

        // Music
        Music music1 = new Music("Thriller", "Michael Jackson", "978-1234600001", 15, "Michael Jackson");
        Music music2 = new Music("Back in Black", "AC/DC", "978-1234600002", 15, "AC/DC");
        Music music3 = new Music("The Dark Side of the Moon", "Pink Floyd", "978-1234600003", 15, "Pink Floyd");
        Music music4 = new Music("Rumours", "Fleetwood Mac", "978-1234600004", 15, "Fleetwood Mac");

        // Users
        User user1 = new User("Alhanouf", "alhanouf@gmail.com", new ArrayList<>(), new ArrayList<>());
        User user2 = new User("Raghad", "raghad@gmail.com", new ArrayList<>(), new ArrayList<>());

        // Store
        ArrayList<User> users = new ArrayList<>(List.of(user1, user2));
        ArrayList<Media> medias = new ArrayList<>(List.of(book1, book2, novel1, novel2, academicBook1, academicBook2, movie1, movie2, movie3, movie4, music1, music2, music3, music4));
        Store store = new Store(users, medias);


        //---------Testing---------

        //***Book***
        //Book > add review
        System.out.println("-------Book > add review-------");
        book2.addReview(review1);
        System.out.println(book2.toString());

        //Book > get average rating
        System.out.println("\n-------Book > get average rating-------");
        System.out.println("Average rating for book \"" + book1.getTitle() + "\" is: " + book1.getAverageRating());

        //Book > restock
        System.out.println("\n-------Book > restock-------");
        System.out.println("book \"" + book2.getTitle() + "\" before restock: " + book2.getStock());
        book2.restock(10);
        System.out.println("book \"" + book2.getTitle() + "\" after restock: " + book2.getStock());
        System.out.println("\n-------Restock with negative-------");
        book1.restock(-5);



        //***Movie***
        //Movie > recommended similar movies
        System.out.println("\n-------Movie > recommended similar movies-------");
        ArrayList<Movie> moviesCatalog = new ArrayList<>(List.of(movie1,movie2,movie3,movie4));
        System.out.println("Recommended movies: ");
        ArrayList<Movie> recommendedMovies = movie1.recommendSimilarMovies(moviesCatalog);
        for(Movie m: recommendedMovies){
            System.out.println(m.toString());
        }
        if (recommendedMovies.isEmpty()) {
            System.out.println("No similar movies found for author: " + movie1.getAuthor());
        }



        //***Music***
        //Music > generate play list
        System.out.println("\n-------Music > generate play list-------");
        ArrayList<Music> musicCatalog = new ArrayList<>(List.of(music1,music2,music3,music4));
        System.out.println("Play list: ");
        ArrayList<Music> playlist = music2.generatePlaylist(musicCatalog);
        for(Music m: playlist){
            System.out.println(m.toString());
        }
        if (playlist.isEmpty()) {
            System.out.println("No similar music found for artist: " + music2.getArtist());
        }



        //***Store***
        System.out.println("\n-------Store > search book-------");
        System.out.println(store.searchBook("Introduction to Algorithms"));
        System.out.println("\n-------Search non existent book-------");
        System.out.println(store.searchBook("NONEXISTENT"));



        //***User***
        //User > add to cart
        System.out.println("\n-------User > add to cart-------");
        user1.addToCart(novel1);
        user1.addToCart(academicBook1);
        user1.addToCart(music1);
        user1.addToCart(movie1);
        System.out.println(user1.getUsername() + "'s cart: \n" + user1.toString());

        //User > remove from cart
        System.out.println("\n-------User > remove from cart-------");
        user1.removeFromCart(academicBook1);
        System.out.println(user1.getUsername() + "'s cart after removing item: \n" + user1.toString());
        System.out.println("\n-------Remove item not in cart-------");
        user1.removeFromCart(book1);

        //User > checkout "its also tests purchase(), watch() and listen()"
        System.out.println("\n-------User > checkout-------");
        user1.checkout();
        System.out.println(user1.getUsername() + " after checkout: \n" + user1.toString());



        //***All classes***
        //get media type:
        System.out.println("\n-------get media type-------");
        System.out.println("Book \"" + book1.getTitle() + "\": " + book1.getMediaType() + "\nAverage Rating: " + book1.getAverageRating() + "\n");
        System.out.println("Novel \"" + novel1.getTitle() + "\": " + novel1.getMediaType() + "\nAverage Rating: " + novel1.getAverageRating() + "\n");
        System.out.println("Academic Book \"" + academicBook1.getTitle() + "\": " + academicBook1.getMediaType() + "\nAverage Rating: " + academicBook1.getAverageRating() + "\n");
        System.out.println("Movie \"" + movie1.getTitle() + "\": " + movie1.getMediaType() + "\nDuration: " + movie1.getDuration() + "\n");
        System.out.println("Music \"" + music1.getTitle() + "\": " + music1.getMediaType() + "\nPrice: " + music1.getPrice());



    }
}