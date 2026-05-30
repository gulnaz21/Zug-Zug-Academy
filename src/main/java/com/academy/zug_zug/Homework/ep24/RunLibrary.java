package com.academy.zug_zug.Homework.ep24;

import com.academy.zug_zug.Homework.ep24.Library.LibrarySystem;

public class RunLibrary {
    private static final String nameFirstBook = "Bella";
    private static final String nameSecondBook = "Bullet";
    private static final String nameThirdBook = "LolKeck";
    private static final String nameFourthBook = "LowKick";
    private static final String nameFirstAuthor = "Andrey_Gaidullyan";
    private static final String nameSecondAuthor = "Sasha_Repay";
    private static final String nameThirdAuthor = "Bonny_Clade";
    private static final String nameFourthAuthor = "Jacki_Chan";
    private static final int bookYear = 2016;

    public static void main(String[] args) {
        LibrarySystem librarySystem = getLibrarySystem();
        librarySystem.removeBook(nameFirstBook, nameFirstAuthor, bookYear);
        librarySystem.removeBook(nameFirstBook, nameSecondAuthor, bookYear);
        librarySystem.findBook(nameFirstBook, nameSecondAuthor, bookYear + 2);
        librarySystem.findBook(nameFirstBook, nameSecondAuthor, bookYear);
        librarySystem.printAllBooks();
    }

    private static LibrarySystem getLibrarySystem() {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.addBook(nameFirstBook, nameFirstAuthor, bookYear, "st1");
        librarySystem.addBook(nameFirstBook, nameFirstAuthor, bookYear, "st666");
        librarySystem.addBook(nameSecondBook, nameSecondAuthor, bookYear, "st2");
        librarySystem.addBook(nameThirdBook, nameThirdAuthor, bookYear, "st3");
        librarySystem.addBook(nameFourthBook, nameFourthAuthor, bookYear, "st4");
        librarySystem.addBook(nameFirstBook, nameSecondAuthor, bookYear + 2, "st4");
        return librarySystem;
    }
}
