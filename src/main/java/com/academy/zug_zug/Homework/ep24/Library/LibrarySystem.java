package com.academy.zug_zug.Homework.ep24.Library;

import java.util.HashMap;
import java.util.Map;

public class LibrarySystem {
    private final HashMap<Book, String> library = new HashMap<>();

    public void addBook(String title, String author, int year, String location) {
        library.put(new Book(title, author, year), location);
    }

    public void removeBook(String title, String author, int year) {
        library.remove(new Book(title, author, year));
    }

    public void findBook(String title, String author, int year) {
        String location = library.get(new Book(title, author, year));
        if (location != null) {
            System.out.println(location);
        } else {
            System.out.println("Указанная книга не найдена в библиотеке");
        }

    }

    public void printAllBooks() {
        for (Map.Entry<Book, String> entry : library.entrySet()) {
            Book book = entry.getKey();
            String value = entry.getValue();
            // используем book и value
            System.out.println("Название книги: " + book.getTitle() + " |Имя автора: " + book.getAuthor() + " |Год выпуска книги:" + book.getYear() + " Местоположение книги-> " + value);
        }
    }

}
