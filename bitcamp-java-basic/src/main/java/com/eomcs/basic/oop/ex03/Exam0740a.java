// 스태틱 초기화 블록(static initializer) - 활용 II : 클래스 로딩과 스태틱 블록 실행
package com.eomcs.basic.oop.ex03;

public class Exam0740a {

  static class A {
    int a;
    int b;
    int c;

    {
      this.a = 101;
      System.out.println("first ins");
    }

    {
      this.a = 102;
      System.out.println("second ins");
    }

    {
      this.a = 103;
      System.out.println("third ins");
    }

    A() {
      System.out.println("A()");
      b = 200;
      c = 300;
    }
  }

  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a=%d, b=%d, c=%d\n", obj1.a, obj1.b, obj1.c);
  }
  }




