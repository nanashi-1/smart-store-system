package org.laiza.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public abstract class TransactionTest {
  protected abstract Transaction getTransaction();

  @Test
  void testGetters() {
    Transaction transaction = getTransaction();

    assertEquals(20000, transaction.getPrice());
  }
}
