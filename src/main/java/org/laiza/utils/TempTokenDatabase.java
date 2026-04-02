package org.laiza.utils;

import java.util.HashMap;

public class TempTokenDatabase implements TokenDatabase {
  private HashMap<String, String> database;

  public TempTokenDatabase() {
    this.database = new HashMap<>();
  }

  public String getCardNumberByToken(String token) {
    return this.database.get(token);
  }

  public void setCardNumberByToken(String token, String cardNumber) {
    this.database.put(token, cardNumber);
  }
}
