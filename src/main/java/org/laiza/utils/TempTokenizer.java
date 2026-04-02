package org.laiza.utils;

import java.util.UUID;

/// This class is used for testing purposes only, and should not be used in production.
/// Replace this with a third party tokenizer like Stripe.
public class TempTokenizer implements Tokenizer {
  private TokenDatabase database;

  public TempTokenizer(TokenDatabase database) {
    this.database = database;
  }

  @Override
  public String tokenize(String cardNumber) {
    String token = "tok_" + UUID.randomUUID().toString().substring(0, 8);

    this.database.setCardNumberByToken(token, cardNumber);

    return token;
  }

  @Override
  public String deTokenize(String token) {
    return this.database.getCardNumberByToken(token);
  }
}
