package com.company.homework8.task1;

import com.company.homework8.task1.Book;
import com.company.homework8.task1.Reader;

public class ReaderRun {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Иванов И.И.", 1, "RES", "01.01.1995", "+3806611111");
        Reader reader2 = new Reader("Петров П.П.", 2, "RES", "02.02.1997", "+3806622222");
        Reader reader3 = new Reader("Андреев А.А.", 3, "AUS", "03.03.2003", "+3806633333");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Мартин Иден", "Джек Лондон");
        Book book2 = new Book("Дюна", "Фрэнк Герберт");
        Book book3 = new Book("Красная таблетка", "Виктор Пелевин");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(5);
        reader2.takeBook("Clean Code, Robert C. Martin", "Java Библиотека профессионала, Кей С. Хорстманн");
        reader3.takeBook(book1, book2,book3);

        reader1.returnBook(1);
        reader2.returnBook("Clean Code, Robert C. Martin");
        reader3.returnBook(book3);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }

}
