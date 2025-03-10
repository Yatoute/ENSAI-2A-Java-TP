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

        library.addBook(fellowshipOfTheRing);

        // print all books
        library.displayBooks();
    }
}