package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
  @Test
  public void whenSecondMax() {
    MultiMax check = new MultiMax();
    int result = check.max(1, 4, 2);
    assertThat(result, is(4));
  }

  @Test
  public void whenFirstMax() {
    MultiMax check = new MultiMax();
    int result = check.max(5, 4, 2);
    assertThat(result, is(5));
  }

  @Test
  public void whenThirdMax() {
    MultiMax check = new MultiMax();
    int result = check.max(1, 2, 3);
    assertThat(result, is(3));
  }

  @Test
  public void whenAllEquals() {
    MultiMax check = new MultiMax();
    int result = check.max(2, 2, 2);
    assertThat(result, is(2));
  }

  @Test
  public void whenNegativeNumbers() {
    MultiMax check = new MultiMax();
    int result = check.max(-2, -1, -5);
    assertThat(result, is(-1));
  }
}