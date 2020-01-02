package ru.job4j.inheritance;

public class Animal {
  private String name;

  public Animal(String name) {
  }

 public Animal() {
    super();
    System.out.println(Animal.class.getSimpleName());
  }

  public static void main(String[] args) {
    Animal simba = new Tiger("Simba");
  }
}
