package org.laiza.model;

public class Electronics extends Product {
  private double warranty;

  public Electronics(String name, String description, double price, double warranty) {
    super(name, description, price);
    this.warranty = warranty;
  }

  public double getWarranty() {
    return warranty;
  }
}
