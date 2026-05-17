package com.gillesngassam;

public class Main {
  public static void main(String[] args) {
    System.out.println("Everything is working fine!");
    Book theGreatGatsby = new Book("The Great Gatsby", "Scott Fitzgerald", 12.85f);
    Book nightHorizon = new Book("L'horizon de la nuit", "Camille GREBE");
    Book theBoyFriend = new EBook("The boyfriend", "Frieda McFadden", 12f, EBookFormat.PDF);

    System.out.println(theGreatGatsby.getPrice());
    System.out.println("Books out : " + Book.booksCount);
  }
}
