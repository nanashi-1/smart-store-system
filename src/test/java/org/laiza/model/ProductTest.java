package org.laiza.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public abstract class ProductTest {

  protected abstract Product createProduct();

  @Test
  void testGetters() {
    Product product = createProduct();
    assertEquals("Item", product.getName());
    assertEquals("Item", product.getDescription());
    assertEquals(50000, product.getPrice());
  }
}
