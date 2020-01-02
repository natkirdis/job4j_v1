package ru.job4j.inheritance;

public class Animal {
  public Animal() {
    super();
    System.out.println(Animal.class.getSimpleName());
  }

  public static void main(String[] args) {
    Tiger bug = new Tiger();
  }
}
