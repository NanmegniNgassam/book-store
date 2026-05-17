package com.gillesngassam.payment;

import java.sql.Date;

public class CardPayment extends Payment {
  private String cardHolder;

  CardPayment(float amount, Date date, String cardHolder) {
    super(amount, date);
    this.cardHolder = cardHolder;
  }

  public String getCardHolder() {
    return cardHolder;
  }

  @Override
  public void pay() {
    System.out.println(
        "Vous avez reglé le montant de "
            + amount
            + "€, le "
            + date
            + " en utilisant la carte de "
            + cardHolder
            + ".");
  }
}
