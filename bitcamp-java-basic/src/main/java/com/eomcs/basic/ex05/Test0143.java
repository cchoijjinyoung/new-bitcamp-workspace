package com.eomcs.basic.ex05;

//# 산술 연산자 : 암시적 형변환(implicit type conversion)
//
public class Test0143 {
  public static void main(String[] args) {
    float f1 = 987.6543f;
    float f2 = 1.111111f;
    
    System.out.println(f1);
    System.out.println(f2);
    
    float r1 = f1 + f2;
    
    System.out.println(r1);
    
    double r2 = f1 + f2;
    System.out.println(r2);
    
    double d1 = 987.6543;
    double d2 = 1.111111;
    double r5 = d1 + d2;
    System.out.println(r5);
    
    
  }
}