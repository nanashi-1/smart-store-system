package org.laiza.model;

public class OnlineTransaction extends Transaction {
  private String referenceNumber;

  public OnlineTransaction(String referenceNumber) {
    super();
    this.referenceNumber = referenceNumber;
  }

  public String getReferenceNumber() {
    return referenceNumber;
  }
}
