package com.eomcs.basic.oop.ex02;

import com.eomcs.basic.oop.ex02.util.Score2;

public class Exam0117 {

  public static void main(String[] args) {

    Score2 s1;
    s1 = new Score2();



    s1.init("ghdrlfehd", 100, 90, 80);
    s1.compute();

    Score2 s2 = new Score2();

    s2.init("dlaRjrwjd", 90, 100, 100);
    s2.compute();


    printScore(s1);

    System.out.println("----------------------------");

    printScore(s2);

  }

  static void printScore(Score2 s) {
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}





