package org.laiza.model;

import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;

public class Items extends ArrayList<Pair<Product, Integer>> {
  private List<Pair<Product, Integer>> items;

  public Items() {
    this.items = new ArrayList<>();
  }

  public void addItem(Product item, int quantity) {
    this.items.add(new Pair<Product, Integer>(item, quantity));
  }
}
