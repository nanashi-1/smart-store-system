package org.laiza.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ElectronicsTest extends ProductTest {
  protected Product createProduct() {
    return new Electronics("Item", "Item", 50000, 1);
  }

  @Test
  void testWarrantyGetter() {
    Electronics product = new Electronics("Laptop", "Laptop with 1 year warranty", 50000, 1);
    assertEquals(1, product.getWarranty());
  }
}
