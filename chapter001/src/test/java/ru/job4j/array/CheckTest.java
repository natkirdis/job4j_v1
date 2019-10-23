package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
  @Test
  public void whenDataMonoByTrueThenTrueOddNumbersInArray() {
    Check check = new Check();
    boolean[] input = new boolean[] {true, true, true};
    boolean result = check.mono(input);
    assertThat(result, is(true));
  }

  @Test
  public void whenDataNotMonoByTrueThenFalseOddNumbersInArray() {
    Check check = new Check();
    boolean[] input = new boolean[] {true, false, true};
    boolean result = check.mono(input);
    assertThat(result, is(false));
  }

  @Test
  public void whenDataMonoByFalseThenTrueEvenNumbersInArray() {
    Check check = new Check();
    boolean[] input = new boolean[] {false, false, false, false};
    boolean result = check.mono(input);
    assertThat(result, is(true));
  }

  @Test
  public void whenDataNotMonoByFalseThenTrueEvenNumbersInArray() {
    Check check = new Check();
    boolean[] input = new boolean[] {false, false, false, true};
    boolean result = check.mono(input);
    assertThat(result, is(false));
  }
}