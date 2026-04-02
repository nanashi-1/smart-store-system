package org.laiza.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OnlineTransactionTest extends TransactionTest {
  protected Transaction getTransaction() {
    Electronics product = new Electronics("Item", "Item", 10000, 1);
    OnlineTransaction transaction = new OnlineTransaction("dummy_reference_number");

    transaction.addItem(product, 2);

    return transaction;
  }

  @Test
  void testGetters() {
    OnlineTransaction transaction = (OnlineTransaction) getTransaction();

    assertEquals("dummy_reference_number", transaction.getReferenceNumber());
  }
}
