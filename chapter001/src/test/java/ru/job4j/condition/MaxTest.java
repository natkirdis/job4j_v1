package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
  @Test
  public void whenTwoNumbersFirstMax() {
    int result = Max.max(3, 2);
    assertThat(result, is(3));
  }

  @Test
  public void whenTwoNumbersSecondMax() {
    int result = Max.max(1, 2);
    assertThat(result, is(2));
  }

  @Test
  public void whenTwoNumbersEquals() {
    int result = Max.max(3, 3);
    assertThat(result, is(3));
  }

  @Test
  public void whenTwoNumbersNegativeNumbers() {
    int result = Max.max(-1, -2);
    assertThat(result, is(-1));
  }

  @Test
  public void whenThreeNumbersThirdMax() {
    int result = Max.max(7, 8, 9);
    assertThat(result, is(9));
  }

  @Test
  public void whenFourNumbersFourthMax() {
    int result = Max.max(7, 8, 9, 10);
    assertThat(result, is(10));
  }

  @Test
  public void whenFourNumbersNegativeNumbers() {
    int result = Max.max(-7, -8, -9, -10);
    assertThat(result, is(-7));
  }
}