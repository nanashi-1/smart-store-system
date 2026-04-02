package org.laiza.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public abstract class TokenizerTest {
  protected abstract Tokenizer getTokenizer();

  @Test
  void testDetokenize() {
    Tokenizer tokenizer = getTokenizer();
    String token = tokenizer.tokenize("5555 5555 5555 5555");

    assertEquals("5555 5555 5555 5555", tokenizer.deTokenize(token));
  }
}
