package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

  @Test
  public void whenArrayHas5Then0() {
    FindLoop find = new FindLoop();
    int[] input = new int[] {5, 10, 3};
    int value = 5;
    int result = find.indexOf(input, value);
    int expect = 0;
    assertThat(result, is(expect));
  }

  @Test
  public void whenLastElementInArray() {
    FindLoop find = new FindLoop();
    int[] input = new int[] {2, 10, 5};
    int value = 5;
    int result = find.indexOf(input, value);
    int expect = 2;
    assertThat(result, is(expect));
  }

  @Test
  public void whenArrayDoestHave5ThenMinus1() {
    FindLoop find = new FindLoop();
    int[] input = new int[] {25, 10, 3};
    int value = 5;
    int result = find.indexOf(input, value);
    int expect = -1;
    assertThat(result, is(expect));
  }

  @Test
  public void whenArrayRange03Has5() {
    FindLoop find = new FindLoop();
    int[] input = new int[] {5, 2, 10, 2, 4};
    int value = 5;
    int start = 0;
    int finish = 3;
    int result = find.indexOf(input, value, start, finish);
    int expect = 0;
    assertThat(result, is(expect));
  }

  @Test
  public void whenArrayRange34Has4() {
    FindLoop find = new FindLoop();
    int[] input = new int[] {5, 2, 10, 2, 4};
    int value = 4;
    int start = 3;
    int finish = 4;
    int result = find.indexOf(input, value, start, finish);
    int expect = 4;
    assertThat(result, is(expect));
  }

  @Test
  public void whenArrayRange14HasNo5() {
    FindLoop find = new FindLoop();
    int[] input = new int[] {5, 2, 10, 2, 4};
    int value = 5;
    int start = 1;
    int finish = 4;
    int result = find.indexOf(input, value, start, finish);
    int expect = -1;
    assertThat(result, is(expect));
  }

}
