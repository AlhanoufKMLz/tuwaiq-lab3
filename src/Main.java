//Alhanouf Allazzam

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //---------Objects---------
        Book book1 = new Book("BOOK1", "AUTHOR1", "ISBN1", 55, 20, new ArrayList<Review>());
        Book book2 = new Book("BOOK2", "AUTHOR2", "ISBN2", 45, 10, new ArrayList<Review>());

        Novel novel1 = new Novel("NOVEL1", "AUTHOR1", "ISBN1", 55, 20, new ArrayList<Review>(), "GENRE1");
        Novel novel2 = new Novel("NOVEL2", "AUTHOR2", "ISBN2", 45, 10, new ArrayList<Review>(), "GENER2");

        AcademicBook academicBook1 = new AcademicBook("ACADEMIC BOOK1", "AUTHOR1", "ISBN1", 25, 5, new ArrayList<Review>(), "MATH");
        AcademicBook academicBook2 = new AcademicBook("ACADEMIC BOOK2", "AUTHOR2", "ISBN2", 35, 7, new ArrayList<Review>(), "COMPUTER");

        Movie movie1 = new Movie("MOVIE1", "AUTHOR1", "ISBN1", 20, 160);
        Movie movie2 = new Movie("MOVIE2", "AUTHOR2", "ISBN2", 25, 100);

        Music music1 = new Music("MUSIC1", "AUTHOR1", "ISBN1", 20, "ARTIST1");
        Music music2 = new Music("MUSIC2", "AUTHOR2", "ISBN2", 25, "ARTIST2");


        //User user1 = new User();

    }
}