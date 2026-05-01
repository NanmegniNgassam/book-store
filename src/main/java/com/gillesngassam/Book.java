package com.gillesngassam;

public class Book {
    public static int booksCount = 0;
    private String title;
    private String author;
    private float price;

    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
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
