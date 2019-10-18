package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

  @Test
  public void rubleToEuro() {
    int in = 140;
    int expected = 2;
    int out = Converter.rubleToEuro(in);
    assertEquals(expected, out);
  }

  @Test
  public void rubleToDollar() {
    int in = 180;
    int expected = 2;
    int out = Converter.rubleToEuro(in);
    assertEquals(expected, out);
  }

  @Test
  public void dollarToRuble() {
    int in = 140;
    int expected = 8400;
    int out = Converter.dollarToRuble(in);
    assertEquals(expected, out);
  }

  @Test
  public void euroToRuble() {
    int in = 140;
    int expected = 9800;
    int out = Converter.euroToRuble(in);
    assertEquals(expected, out);
  }
}
