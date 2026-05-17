package com.gillesngassam.payment;

import java.util.Date;

public class Payment {
  protected float amount;
  protected Date date;

  Payment(float amount, Date date) {
    this.amount = amount;
    this.date = date;
  }

  public void pay() {
    System.out.println("Vous avez reglé le montant de " + amount + "€, le " + date + ".");
  }
}
