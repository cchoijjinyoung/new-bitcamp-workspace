package com.eomcs.basic.ex05;

//# 산술 연산자 : 암시적 형변환(implicit type conversion)
//
public class Test0210 {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    
    boolean r1 = a < b;
    
    System.out.println(a < b);
    System.out.println(a <= b);
    System.out.println(a > b);
    System.out.println(a >= b);
    System.out.println(a == b);
    System.out.println(a != b);
  }
}