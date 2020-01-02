package ru.job4j.tracker;

public class Item {
  public Item(String name) {
    super();
    System.out.println("load item");
  }

  public Item() {
  }

  public static void main(String[] args) {
    Item item = new Item();
  }
}
