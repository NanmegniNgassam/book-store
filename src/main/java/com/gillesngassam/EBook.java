package com.gillesngassam;

public class EBook extends Book {
    private EBookFormat format;

    public EBook(String title, String author, float price, EBookFormat format) {
        super(title, author, price);
        this.format = format;
    }
}
