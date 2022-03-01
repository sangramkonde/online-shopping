package com.san.product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;
import java.util.stream.Collector;

public class Test {

  public static void main(String []args) {

      List<Integer> numList = new ArrayList<>();
      numList.add(10);
      numList.add(20);
      numList.add(30);

      BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a+b);
      biConsumer.accept(10,20);
//      BiConsumer consumer = numList.stream().
//
//      BooleanSupplier supplier = numList.stream()
//              .filter(num -> numList.contains(10)).;
  }
}
