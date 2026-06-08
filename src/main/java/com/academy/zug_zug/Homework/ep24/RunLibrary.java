package com.academy.zug_zug.Homework.ep24;

import com.academy.zug_zug.Homework.ep24.Library.Book;
import com.academy.zug_zug.Homework.ep24.Library.LibrarySystem;

public class RunLibrary {
    private static final String NAME_FIRST_BOOK = "Bella";
    private static final String NAME_SECOND_BOOK = "Bullet";
    private static final String NAME_THIRD_BOOK = "LolKeck";
    private static final String NAME_FOURTH_BOOK = "LowKick";
    private static final String NAME_FIRST_AUTHOR = "Andrey_Gaidullyan";
    private static final String NAME_SECOND_AUTHOR = "Sasha_Repay";
    private static final String NAME_THIRD_AUTHOR = "Bonny_Clade";
    private static final String NAME_FOURTH_AUTHOR = "Jacki_Chan";
    private static final int BOOK_YEAR = 2016;

    public static void main(String[] args) {
        LibrarySystem librarySystem = getLibrarySystem();
        librarySystem.removeBook(new Book(NAME_FIRST_BOOK, NAME_FIRST_AUTHOR, BOOK_YEAR));
        librarySystem.removeBook(new Book(NAME_FIRST_BOOK, NAME_SECOND_AUTHOR, BOOK_YEAR));
        System.out.println(librarySystem.findBook(new Book(NAME_FIRST_BOOK, NAME_SECOND_AUTHOR, BOOK_YEAR + 2)));
        System.out.println(librarySystem.findBook(new Book(NAME_FIRST_BOOK, NAME_SECOND_AUTHOR, BOOK_YEAR)));
        System.out.println(librarySystem.findBook(null));
        librarySystem.printAllBooks();
    }

    private static LibrarySystem getLibrarySystem() {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.addBook(new Book(NAME_FIRST_BOOK, NAME_FIRST_AUTHOR, BOOK_YEAR), "st1");
        librarySystem.addBook(new Book(NAME_FIRST_BOOK, NAME_FIRST_AUTHOR, BOOK_YEAR), "st666");
        librarySystem.addBook(new Book(NAME_SECOND_BOOK, NAME_SECOND_AUTHOR, BOOK_YEAR), "st2");
        librarySystem.addBook(new Book(NAME_THIRD_BOOK, NAME_THIRD_AUTHOR, BOOK_YEAR), "st3");
        librarySystem.addBook(new Book(NAME_FOURTH_BOOK, NAME_FOURTH_AUTHOR, BOOK_YEAR), "st4");
        librarySystem.addBook(new Book(NAME_FIRST_BOOK, NAME_SECOND_AUTHOR, BOOK_YEAR + 2), "st4");
        return librarySystem;
    }
}
