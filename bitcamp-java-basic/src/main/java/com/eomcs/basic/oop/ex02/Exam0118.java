package com.eomcs.basic.oop.ex02;

import com.eomcs.basic.oop.ex02.util.Score3;

public class Exam0118 {

  public static void main(String[] args) {

    Score3 s1;
    s1 = new Score3();



    s1.init("ghdrlfehd", 100, 90, 80);


    Score3 s2 = new Score3();

    s2.init("dlaRjrwjd", 90, 100, 100);



    printScore(s1);

    System.out.println("----------------------------");

    printScore(s2);

  }

  static void printScore(Score3 s) {
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}





