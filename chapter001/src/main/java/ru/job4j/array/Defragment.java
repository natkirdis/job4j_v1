package ru.job4j.array;

public class Defragment {
  public static String[] compress(String[] array) {
    for (int index = 0; index < array.length - 1; index++) {
      String cell = array[index];
      int indexSecond = index + 1;
      if (cell == null) {
        while ((indexSecond < array.length - 1) && (array[indexSecond] == null)) {
          indexSecond +=1;
        }
        array[index] = array[indexSecond];
        array[indexSecond] = null;
      }
      System.out.print(array[index] + " ");
    }
    return array;
  }

  public static void main(String[] args) {
    String[] input = {"I", null, null, null, "be", null, "compressed"};
    String[] compressed = compress(input);
    System.out.println();
    for (int index = 0; index < compressed.length; index++) {
      System.out.print(compressed[index] + " ");
    }
  }
}