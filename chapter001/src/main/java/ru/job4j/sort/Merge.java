package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

  public int[] merge(int[] left, int[] right) {
    int[] rsl = new int[left.length + right.length];
    int leftIndex = 0;
    int rightIndex = 0;
    int rslIndex = 0;

    while ((leftIndex < left.length) && (rightIndex < right.length)) {
      if (left[leftIndex] > right[rightIndex]) {
        rsl[rslIndex] = right[rightIndex];
        rightIndex++;
      } else {
        rsl[rslIndex] = left[leftIndex];
        leftIndex++;
      }
      rslIndex++;
    }

    while (rightIndex < right.length) {
      rsl[rslIndex] = right[rightIndex];
      rightIndex++;
      rslIndex++;
    }

    while (leftIndex < left.length) {
      rsl[rslIndex] = left[leftIndex];
      leftIndex++;
      rslIndex++;
    }

    return rsl;


  }

  public static void main(String[] args) {
    Merge process = new Merge();
    int[] rsl = process.merge(
            new int[]{1, 3, 5},
            new int[]{2, 4}
    );
    System.out.println(Arrays.toString(rsl));
  }
}