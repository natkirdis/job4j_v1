package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
//import static ru.job4j.condition.Point;

public class PointTest {
  @Test
  public void pointPositiveTest() {

    Point a = new Point(0, 0);
    Point b = new Point(0, 2);

    double expected = 2.0;
    double out = a.distance(b);
    assertEquals(expected, out, 0.01);
  }

  @Test
  public void pointNegativeVectorTest() {
    Point a = new Point(5, -1);
    Point b = new Point(10, -5);
    double expected = 6.4031242374328485;
    double out = a.distance(b);
    assertEquals(expected, out, 0.01);
  }

  @Test
  public void pointPositiveVectorTest() {
    Point a = new Point(-5, 1);
    Point b = new Point(-10, 5);
    double expected = 6.4031242374328485;
    double out = a.distance(b);
    assertEquals(expected, out, 0.01);
  }

  @Test
  public void pointNullDistanceTest() {
    Point a = new Point(0, 0);
    Point b = new Point(0, 0);
    double expected = 0;
    double out = a.distance(b);
    assertEquals(expected, out, 0.01);
  }
}
