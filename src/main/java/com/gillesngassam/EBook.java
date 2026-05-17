package com.gillesngassam;

public class EBook extends Book {
  private EBookFormat format;

  EBook(String title, String author, float price, EBookFormat format) {
    super(title, author, price);
    this.format = format;
  }

  public EBookFormat getFormat() {
    return format;
  }
}
