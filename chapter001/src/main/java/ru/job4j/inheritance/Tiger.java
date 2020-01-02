package ru.job4j.inheritance;

public class Tiger extends Predator {
  public Tiger() {
  }

  public Tiger(String name) {
    super(name);
    System.out.println(Tiger.class.getSimpleName());
  }
}
