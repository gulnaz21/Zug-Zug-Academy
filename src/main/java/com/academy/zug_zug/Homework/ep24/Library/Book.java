package com.academy.zug_zug.Homework.ep24.Library;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class Book {
    private String title;
    private String author;
    private int year;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && year == book.year;
    }

    @Override
    public int hashCode() {
        char[] firstChars = title.toCharArray();
        char[] secondHangChars = author.toCharArray();
        int result = 0;
        for (char c : firstChars) {
            result += c;
        }

        for (char c : secondHangChars) {
            result += c;
        }
        return result * 228 + year;
    }
}
