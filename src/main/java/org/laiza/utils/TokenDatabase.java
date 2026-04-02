package org.laiza.utils;

/// This class is used for testing purposes only, and should not be used in production.
/// Replace this with a third party database like Stripe.
public interface TokenDatabase {
  public String getCardNumberByToken(String token);

  public void setCardNumberByToken(String token, String cardNumber);
}
