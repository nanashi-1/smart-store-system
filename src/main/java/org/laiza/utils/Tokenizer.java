package org.laiza.utils;

public interface Tokenizer {
  public String tokenize(String cardNumber);

  public String deTokenize(String token);
}
