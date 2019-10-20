package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
  @Test
  public void whenFirstMax() {
    int result = Max.max(3, 2);
    assertThat(result, is(3));
  }

  @Test
  public void whenSecondMax() {
    int result = Max.max(1, 2);
    assertThat(result, is(2));
  }

  @Test
  public void whenEquals() {
    int result = Max.max(3, 3);
    assertThat(result, is(3));
  }

  @Test
  public void whenNegativeNumbers() {
    int result = Max.max(-1, -2);
    assertThat(result, is(-1));
  }
}