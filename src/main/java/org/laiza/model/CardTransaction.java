package org.laiza.model;

import org.laiza.utils.Tokenizer;

public class CardTransaction extends Transaction {
  private String lastFourDigits; // This is for display purposes only.
  private String cardType;
  private String authCode;
  private String gatewayReference;
  private String tokenizedCardNumber; // Card number is tokenized for PCI compliance.

  public CardTransaction(String cardNumber, String authCode, String gatewayReference,
      Tokenizer tokenizer) {
    super();

    this.lastFourDigits = cardNumber.substring(cardNumber.length() - 4);
    this.authCode = authCode;
    this.gatewayReference = gatewayReference;

    switch (cardNumber.charAt(0)) {
      case '2':
        this.cardType = "MasterCard";
        break;
      case '3':
        this.cardType = "American Express";
        break;
      case '4':
        this.cardType = "Visa";
        break;
      case '5':
        this.cardType = "MasterCard";
        break;
      case '6':
        this.cardType = "Discover";
        break;
      default:
        this.cardType = "Unknown";
    }

    this.tokenizedCardNumber = tokenizer.tokenize(cardNumber);
  }

  public String getLastFourDigits() {
    return lastFourDigits;
  }

  public String getCardType() {
    return cardType;
  }

  public String getAuthCode() {
    return authCode;
  }

  public String getGatewayReference() {
    return gatewayReference;
  }

  public String getTokenizedCardNumber() {
    return tokenizedCardNumber;
  }
}
