package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.job4j.calculator.Fit.manWeight;
import static ru.job4j.condition.TrgArea.area;

public class TrgAreaTest {


  @Test
  public void TrgAreaPositiveTest() {
    double[] in = {2.0, 2.0, 2.0};
    double expected = 1.7320508075688772;
    double out = area(in[0], in[1], in[2]);

    assertEquals(expected, out, 0.01);
  }

  @Test
  public void TrgAreaRightAngledTest() {
    double[] in = {3.0, 4.0, 5.0};
    double expected = 6;
    double out = area(in[0], in[1], in[2]);

    assertEquals(expected, out, 0.01);
  }

  @Test
  public void TrgAreaIsoscelesTest() {
    double[] in = {3.0, 3.0, 5.0};
    double expected = 4.14578098794425;
    double out = area(in[0], in[1], in[2]);

    assertEquals(expected, out, 0.01);
  }
}
