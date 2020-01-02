package ru.job4j.condition;

public class Point {
  private int x;
  private int y;
  private int z;

  /**
   * Конструтор, который принимает начальное состояние объекта "точка"
   *
   * @param x координата x
   * @param y координата y
   */
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Конструтор, который принимает начальное состояние объекта "точка"
   *
   * @param x координата x
   * @param y координата y
   * @param z координата y
   */
  public Point(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public double distance(Point that) {
    return Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2));
  }

  public double distance3d(Point that) {
    return Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2) + Math.pow((this.z - that.z), 2));
  }
}