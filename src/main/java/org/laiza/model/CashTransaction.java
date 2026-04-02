package org.laiza.model;

public class CashTransaction extends Transaction {
  private double cashAmount;
  private double change;

  public CashTransaction(double cashAmount) {
    super();
    this.cashAmount = cashAmount;

  }

  public double getChange() {
    return change;
  }

  public double getCashAmount() {
    return cashAmount;
  }

  @Override
  public void addItem(Product item, int quantity) {
    super.addItem(item, quantity);

    if (cashAmount < this.price) {
      throw new IllegalArgumentException("Insufficient cash amount");
    }

    this.change = cashAmount - this.price;

  }
}
