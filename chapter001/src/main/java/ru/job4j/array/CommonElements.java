package ru.job4j.array;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class CommonElements {
  public static void compare(int[] array1, int[] array2) {
    ArrayList resultList = new ArrayList();
    for (int elementArray1 : array1) {
      for (int elementArray2 : array2) {
        if (elementArray1 == elementArray2 && !resultList.contains(elementArray1)) {
          resultList.add(elementArray1);
          System.out.println(elementArray1);
        }
      }
    }
  }
}
