package com.eomcs.oop.ex02;

public class Exam0112 {

  static class Score {

    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

  }

  public static void main(String[] args) {
    Score s1 = new Score();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 97;
    s1.math = 80;
    s1.sum = s1.kor + s1.eng +s1.math;
    s1.aver = (float)s1.sum / 3;

    Score s2 = new Score();

    s2.name = "오세준";
    s2.kor = 90;
    s2.eng = 100;
    s2.math = 100;
    s2.sum = s2.kor + s2.eng + s2.math;
    s2.aver = (float)s2.sum / 3;
    printScore(s1);
    printScore(s2);
  }

  static void printScore(Score s) {
    System.out.printf("%s : %d, %d, %d, %d, %.1f \n",
        s.name,s.kor,s.eng,s.math,s.sum,s.aver);
  }

}