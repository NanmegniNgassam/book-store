package com.gillesngassam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {
  private static final float DEFAULT_BOOK_PRICE = 6.99f;
  private static final float GREAT_GATSBY_PRICE = 25f;
  private static final String GREAT_GATSBY_TITLE = "The Great Gatsby";
  private static final String GREAT_GATSBY_AUTHOR = "Scott Fitzgerald";
  private static final String AMAZING_SPIDERMAN_TITLE = "The Amazing Spider-man";
  private static final String AMAZING_SPIDERMAN_AUTHOR = "Stan Lee";

  @BeforeEach
  void cleanUp() {
    Book.booksCount = 0;
  }

  @Test
  void should_IncrementBooksCount_When_BookIsInstantiated() {
    new Book(GREAT_GATSBY_TITLE, GREAT_GATSBY_AUTHOR, GREAT_GATSBY_PRICE);
    new Book(AMAZING_SPIDERMAN_TITLE, AMAZING_SPIDERMAN_AUTHOR);

    assertEquals(2, Book.booksCount);
  }

  @Test
  void should_CorrectlyAssignProperties_When_Instantiating() {
    String title = "The Great Gatsby";
    String author = "Scott Fitzgerald";
    float price = 25f;
    final Book theGreatGatsby = new Book(title, author, price);

    assertEquals("The Great Gatsby", theGreatGatsby.getTitle());
    assertEquals("Scott Fitzgerald", theGreatGatsby.getAuthor());
    assertEquals(25f, theGreatGatsby.getPrice());
  }

  @Test
  void should_AssignDefaultPrice_When_InstantiatingWithoutPriceParameter() {
    final Book theGreatGatsby = new Book(AMAZING_SPIDERMAN_TITLE, AMAZING_SPIDERMAN_AUTHOR);

    assertEquals(DEFAULT_BOOK_PRICE, theGreatGatsby.getPrice());
  }
}
