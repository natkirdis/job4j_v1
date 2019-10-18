package ru.job4j.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static ru.job4j.calculator.Fit.*;

public class FitTest {
  @Test
  public void manWeightTest() {
    double in = 170.0;
    double expected = 80.5;
    double out = manWeight(in);
    assertEquals(expected, out, 0.01);
  }

  @Test
  public void womanWeightTest() {
    double in = 170.0;
    double expected = 69.0;
    double out = womanWeight(in);
    assertEquals(expected, out, 0.01);
  }
}
