package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.array.Turn;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class TurnTest {

  @Test
  public void whenEvenElementsInArray() {
    Turn turn = new Turn();
    int[] input = new int[] {1, 2, 3, 4};
    int[] result = turn.back(input);
    int[] expect = new int[] {4, 3, 2, 1};

    assertThat(result, is(expect));
  }

  @Test
  public void whenOddElementsInArray() {
    Turn turn = new Turn();
    int[] input = new int[] {1, 2, 3, 4, 5};
    int[] result = turn.back(input);
    int[] expect = new int[] {5, 4, 3, 2, 1};

    assertThat(result, is(expect));
  }
}
