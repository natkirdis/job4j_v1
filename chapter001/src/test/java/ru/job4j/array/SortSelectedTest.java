package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
  @Test
  public void when5PositiveNumbersSort() {
    int[] input = new int[] {3, 4, 1, 2, 5};
    int result[] = SortSelected.sort(input);
    int[] expect = new int[] {1, 2, 3, 4, 5};
    assertThat(result, is(expect));
  }

  @Test
  public void when5MixedNumbersSort() {
    int[] input = new int[] {-3, -4, 1, 0, 5};
    int result[] = SortSelected.sort(input);
    int[] expect = new int[] { -4, -3, 0, 1, 5};
    assertThat(result, is(expect));
  }

  @Test
  public void when3SortedNumbersSort() {
    int[] input = new int[] {1, 2, 3};
    int result[] = SortSelected.sort(input);
    int[] expect = new int[] {1, 2, 3};
    assertThat(result, is(expect));
  }
}