package org.example;

public class Calc {

    public int summ1(int a, int b){
      int result;
      result = a + b;
      System.out.println("Сумма " + a + " и " + b + " равно " + result);
      return result;
    }

    public int summ2(int a, int b){
        int result;
        result = a - b;
        System.out.println("Сумма " + a + " и " + b + " равно " + result);
        return result;
    }
}
