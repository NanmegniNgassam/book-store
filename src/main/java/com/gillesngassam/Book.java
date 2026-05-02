package com.gillesngassam;

public class Book {
    public static int booksCount = 0;
    private String title;
    private String author;
    private float price;

    Book(String title, String author, float price) {
        Book.booksCount++;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(String title, String author) {
        Book.booksCount++;
        this.title = title;
        this.author = author;
        this.price = 6.99f;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public float getPrice() {
        return price;
    }
}
