package ru.job4j.array;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class CommonElements {
  public static void compare(int[] arrayFirst, int[] arraySecond) {
    ArrayList result = new ArrayList();
    for (int first : arrayFirst) {
      for (int second : arraySecond) {
        if (first == second && !result.contains(first)) {
          result.add(first);
          System.out.println(first);
        }
      }
    }
  }
}
