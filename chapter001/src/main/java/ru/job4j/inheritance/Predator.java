package ru.job4j.inheritance;

public class Predator extends Animal {
  public Predator() {
  }

  public Predator(String name) {
    super(name);
    System.out.println(Predator.class.getSimpleName());
  }
}
