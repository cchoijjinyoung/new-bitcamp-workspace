// 메서드 오버로딩(overloading) - 문법 사용 후
package com.eomcs.oop.ex06.b;

public class Exam121 {

  static class Calculator {
    static int plus(int a, int b) {
      return a + b;
    }

    static int plus(int a) {
      return a + a;
    }

    static float plus(float a, float b) {
      return a + b;

    }
  }

  public static void main(String[] args) {
    int r1 = Calculator.plus(100, 200);
    int r2 = Calculator.plus(100);
    float r3 = Calculator.plus(35.7f, 22.2f);

    System.out.printf("%d, %d, %.1f\n", r1, r2, r3);

    float r4 = Calculator.plus(35.7f, 22f);
    System.out.println(r4);
    float r5 = Calculator.plus(35.7, 22f);
  }
}







