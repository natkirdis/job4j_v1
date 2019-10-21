package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
  @Test
  public void positiveTest() {
    Counter check = new Counter();
    int result = check.add(1, 10);
    assertThat(result, is(30));
  }

  @Test
  public void startNumMoreThanFinishTest() {
    Counter check = new Counter();
    int result = check.add(10, 1);
    assertThat(result, is(0));
  }

  @Test
  public void negativeNumbersTest() {
    Counter check = new Counter();
    int result = check.add(-10, -1);
    assertThat(result, is(-30));
  }
}
