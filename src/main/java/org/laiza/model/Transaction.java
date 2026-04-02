package org.laiza.model;

public abstract class Transaction {

  protected Items items;
  protected double price;

  public Transaction() {
    this.items = new Items();
    items.forEach((item) -> this.price += item.getKey().getPrice() * item.getValue());
  }

  public void addItem(Product item, int quantity) {
    items.addItem(item, quantity);
    this.price += item.getPrice() * quantity;
  }

  public double getPrice() {
    return price;
  }

  public Items getItems() {
    return items;
  }
}
