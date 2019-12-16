package ru.job4j.oop;

public class Jukebox {
  public void music(int position) {
    if (position == 1) {
      System.out.println("Пусть бегут неуклюже");
    } else if (position == 2) {
      System.out.println("Спокойной ночи");
    } else {
      System.out.println("Песня не найдена");
    }
  }

  public static void main(String[] args) {
    Jukebox children = new Jukebox();
    children.music(1);
    children.music(2);
    children.music(3);
  }
}
