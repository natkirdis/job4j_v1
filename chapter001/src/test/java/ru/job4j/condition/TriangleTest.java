package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static ru.job4j.condition.TrgArea.area;

public class TriangleTest {
  @Test
  public void trgAreaPositiveTest() {
    Point a = new Point(1, 1);
    Point b = new Point(2, 5);
    Point c = new Point(5, 3);
    Triangle trg = new Triangle(a, b, c);
    double expected = 7.0;
    double out = trg.area();
    assertEquals(expected, out, 0.01);
  }

  @Test
  public void trgNotExistAreaTest() {
    Point a = new Point(0, 0);
    Point b = new Point(1, 1);
    Point c = new Point(2, 2);
    Triangle trg = new Triangle(a, b, c);
    double expected = -1;
    double out = trg.area();
    assertEquals(expected, out, 0.01);
  }
}