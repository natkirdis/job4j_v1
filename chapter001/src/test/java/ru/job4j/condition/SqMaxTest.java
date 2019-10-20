package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

  @Test
  public void whenFirstMax() {
    SqMax check = new SqMax();
    int result = check.max(5, 4, 2, 3);
    assertThat(result, is(5));
  }

  @Test
  public void whenSecondMax() {
    SqMax check = new SqMax();
    int result = check.max(4, 6, 2, 3);
    assertThat(result, is(6));
  }

  @Test
  public void whenThirdMax() {
    SqMax check = new SqMax();
    int result = check.max(4, 1, 7, 3);
    assertThat(result, is(7));
  }

  @Test
  public void whenForthMax() {
    SqMax check = new SqMax();
    int result = check.max(4, 1, 1, 5);
    assertThat(result, is(5));
  }

  @Test
  public void whenAllEquals() {
    SqMax check = new SqMax();
    int result = check.max(4, 4, 4, 4);
    assertThat(result, is(4));
  }

  @Test
  public void whenNegativeNumbers() {
    SqMax check = new SqMax();
    int result = check.max(-4, -3, -2, -1);
    assertThat(result, is(-1));
  }

  @Test
  public void whenNullNumber() {
    SqMax check = new SqMax();
    int result = check.max(0, -3, -2, -1);
    assertThat(result, is(0));
  }
}
