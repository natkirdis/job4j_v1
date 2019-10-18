package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static ru.job4j.condition.Point.distance;

public class PointTest {
  @Test
  public void pointPositiveTest() {
    int[] coordinates = {0, 0, 2, 0};

    double expected = 2.0;
    double out = distance(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
    assertEquals(expected, out, 0.01);
  }

  @Test
  public void pointNegativeVectorTest() {
    int[] coordinates = {5, -1, 10, -5};

    double expected = 6.4031242374328485;
    double out = distance(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
    assertEquals(expected, out, 0.01);
  }

  @Test
  public void pointPositiveVectorTest() {
    int[] coordinates = {-5, 1, -10, 5};

    double expected = 6.4031242374328485;
    double out = distance(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
    assertEquals(expected, out, 0.01);
  }

  @Test
  public void pointNullDistanceTest() {
    int[] coordinates = {0, 0, 0, 0};

    double expected = 0.0;
    double out = distance(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
    assertEquals(expected, out, 0.01);
  }
}
