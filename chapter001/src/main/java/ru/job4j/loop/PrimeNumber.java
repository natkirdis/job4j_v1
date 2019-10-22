package ru.job4j.loop;

public class PrimeNumber {
  public int calc(int finish) {
    int count = 0;
    CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();

    for (int j = 2; j <= finish; j++) {
      if (checkPrimeNumber.check(j)) {
        count++;
      }
    }

    return count;
  }
}
