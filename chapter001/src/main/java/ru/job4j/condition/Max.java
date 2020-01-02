package ru.job4j.condition;

public class Max {
  public static int max(int first, int second) {
    int result = (first > second) ? first : second;
    return result;
  }

  public static int max(int first, int second, int third) {
    int result = max(max(first, second), third);
    return result;
  }

  public static int max(int first, int second, int third, int fourth) {
    int result = max(max(first, second, third), fourth);
    return result;
  }
}