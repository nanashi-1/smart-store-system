package org.laiza.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CashTransactionTest extends TransactionTest {
  protected Transaction getTransaction() {
    Product product = new Electronics("Item", "Item", 10000, 1);
    CashTransaction transaction = new CashTransaction(20000);
    transaction.addItem(product, 2);
    return transaction;
  }

  @Test
  void testChange() {
    Electronics product = new Electronics("Laptop", "HP Laptop with one year warranty", 50000, 1);
    CashTransaction transaction = new CashTransaction(110000);
    transaction.addItem(product, 2);

    assertEquals(10000, transaction.getChange());
  }

  @Test
  void testShortOnCash() {
    Electronics product = new Electronics("Laptop", "HP Laptop with one year warranty", 50000, 1);
    CashTransaction transaction = new CashTransaction(10000);

    assertThrows(IllegalArgumentException.class, () -> {
      transaction.addItem(product, 2);
    });
  }
}
