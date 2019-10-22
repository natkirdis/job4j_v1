package ru.job4j.loop;

public class PrimeNumber {
  public int calc(int finish) {
    int count = 0;


    for (int j = 2; j <=finish; j++) {
      boolean isPrime = true;
      for (int i = 2; i <= j / 2; i++) {
        if (j % i == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime == true) {
        count++;
      }
    }

    return count;
  }
}
