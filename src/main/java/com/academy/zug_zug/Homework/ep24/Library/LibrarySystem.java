package com.academy.zug_zug.Homework.ep24.Library;

import java.util.HashMap;
import java.util.Map;

public class LibrarySystem {
    private final Map<Book, String> library;

    public LibrarySystem() {
        library = new HashMap<>();
    }

    public void addBook(Book book, String location) {
        library.put(book, location);
    }

    public void removeBook(Book book) {
        if (findBook(book) != null) {
            library.remove(book);
        }
    }

    public String findBook(Book book) {
        String location = library.get(book);
        if (book != null && location != null) {
            return location;
        } else {
            return null;
        }
    }

    public void printAllBooks() {
        for (Map.Entry<Book, String> entry : library.entrySet()) {
            Book book = entry.getKey();
            String value = entry.getValue();
            System.out.println(book + " --> " + value);
        }
    }

}
