package com.eomcs.basic.ex05;

// 비트 연산자 & 활용 : 픽셀에서 파란색의 값을 강화시키고 싶다.

public class Test0440 {
 public static void main(String[] args) {
   
   int i = 0x27a130ff;
   
   int a, b, c ,d;
   
   System.out.println(i);
   
   a = i >> 24;
   b = (i >> 16) & 0xff;
   c = (i >> 8) & 0xff;
   d = i & 0xff;
   
   System.out.println(i >>> a);
   
   System.out.println(i >>> b);
   
   System.out.println(i >>> c);
   
   System.out.println(i >>> d);
   
   
   
   
   

   

  }
}