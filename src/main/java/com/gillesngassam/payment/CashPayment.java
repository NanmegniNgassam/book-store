package com.gillesngassam.payment;

import java.util.Date;

public class CashPayment extends Payment {

  CashPayment(float amount, Date date) {
    super(amount, date);
  }

  @Override
  public void pay() {
    System.out.println(
        "Vous avez reglé le montant de " + amount + "€, le " + date + " en espèces.");
  }
}
