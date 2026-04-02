package org.laiza.model;

class BooksTest extends ProductTest {
  protected Product createProduct() {
    return new Books("Item", "Item", 50000);
  }
}
