package com.eomcs.basic.ex05;

// 비트 연산자 & 활용 : 픽셀에서 파란색의 값을 강화시키고 싶다.

public class Test0410 {
 public static void main(String[] args) {
   
   int i = 1;
   
   System.out.println(i << 1);
   
   System.out.println(i << 2);
   
   System.out.println(i << 3);
   
   System.out.println(i << 4);
   
   i = 0b0000_1011;
   System.out.println(i << 1);
   System.out.println(i << 2);
   System.out.println(i << 3);
   
   String s = "abc";
   String s2 = "가나다";
   String s3 = "a가b";
   
   System.out.println(s.length());
   System.out.println(s2.length());
   System.out.println(s2.length());
   
   
   

   

  }
}