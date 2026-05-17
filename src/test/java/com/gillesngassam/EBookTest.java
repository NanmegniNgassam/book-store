package com.gillesngassam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EBookTest {
  private static final float GREAT_GATSBY_PRICE = 25f;
  private static final String GREAT_GATSBY_TITLE = "The Great Gatsby";
  private static final String GREAT_GATSBY_AUTHOR = "Scott Fitzgerald";
  private static final EBookFormat GREAT_GATSBY_BOOK_FORMAT = EBookFormat.PDF;

  @Test
  void should_AssignTheRightFormat_When_InstantiatingEBook() {
    final EBook greatGatsby =
        new EBook(
            GREAT_GATSBY_TITLE, GREAT_GATSBY_AUTHOR, GREAT_GATSBY_PRICE, GREAT_GATSBY_BOOK_FORMAT);

    assertEquals(EBookFormat.PDF, greatGatsby.getFormat());
  }
}
