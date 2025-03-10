package fr.ensai.library;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        System.out.println(fellowshipOfTheRing.toString());

        // Create a new library
        Library library = new Library("Library ENSAI");

        // Load books forom ./resources/books in the library
        library.loadBooksFromCSV("books.csv");

        // Add new book in the library
        library.addItem(fellowshipOfTheRing);

        //Create two Mangazine
        Magazine magazine1 = new Magazine(
        "National Geographic",
        2023,
        120,
        "978-1-4262-1234-5",
        "101"
         );
        library.addItem(magazine1);

        Magazine magazine2 = new Magazine(
        "Time Magazine",
        2022,
        95,
        "978-0-7653-4567-8",
        "202"
         );

        library.addItem(magazine2);


        // print all books
        library.displayItems();
    }
}