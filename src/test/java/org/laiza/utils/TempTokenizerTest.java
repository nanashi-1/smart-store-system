package org.laiza.utils;

class TempTokenizerTest extends TokenizerTest {
  protected Tokenizer getTokenizer() {
    TempTokenDatabase database = new TempTokenDatabase();
    return new TempTokenizer(database);
  }
}
