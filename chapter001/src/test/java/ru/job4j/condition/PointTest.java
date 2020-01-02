package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PointTest {
  @Test
  public void distance2dPositiveTest() {

    Point a = new Point(0, 0);
    Point b = new Point(0, 2);

    double expected = 2.0;
    double out = a.distance(b);
    assertEquals(expected, out, 0.01);
  }

  @Test
  public void distance2dNegativeVectorTest() {
    Point a = new Point(5, -1);
    Point b = new Point(10, -5);
    double expected = 6.4031242374328485;
    double out = a.distance(b);
    assertEquals(expected, out, 0.01);
  }

  @Test
  public void distance2dPositiveVectorTest() {
    Point a = new Point(-5, 1);
    Point b = new Point(-10, 5);
    double expected = 6.4031242374328485;
    double out = a.distance(b);
    assertEquals(expected, out, 0.01);
  }

  @Test
  public void distance2dNullDistanceTest() {
    Point a = new Point(0, 0);
    Point b = new Point(0, 0);
    double expected = 0;
    double out = a.distance(b);
    assertEquals(expected, out, 0.01);
  }

  @Test
  public void distance3dPositiveTest() {

    Point a = new Point(0, 0, 4);
    Point b = new Point(1, 2, 6);

    double expected = 3.0;
    double out = a.distance3d(b);
    assertEquals(expected, out, 0.01);
  }

  @Test
  public void distance3dNullDistanceTest() {

    Point a = new Point(0, 0, 0);
    Point b = new Point(0, 0, 0);

    double expected = 0;
    double out = a.distance3d(b);
    assertEquals(expected, out, 0.01);
  }
}
