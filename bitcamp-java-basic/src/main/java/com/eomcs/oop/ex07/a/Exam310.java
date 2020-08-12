//# 캡슐화 문법 사용 후 - 필드의 값을 변경할 때 마다 특정 작업을 수행하게 만들기
package com.eomcs.oop.ex07.a;

class Score44 {
  String name;

  private int kor;
  private int eng;
  private int math;

  public void setKor(int kor) {
    this.kor = kor;
    this.compute();
  }

  public int getKor() {
    return this.kor;

  }

  public void setEng(int eng) {
    this.eng = eng;
    this.compute();
  }

  public int getEng() {
    return this.eng;
  }

  public void setMath(int math) {
    this.math = math;
    this.compute();
  }

  public int getMath() {
    return this.math;
  }

  private int sum;
  private float aver;

  public int getSum() {
    return this.sum;
  }

  public float getAver() {
    return this.aver;
  }

  private void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
}

public class Exam310 {
  public static void main(String[] args) {
    Score44 s1 = new Score44();
    s1.name = "ghdrlfehd";
    s1.setKor(100);
    s1.setEng(90);
    s1.setMath(80);

    s1.setEng(100);
    s1.setMath(100);

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s1.name,
        s1.getKor(), s1.getEng(), s1.getMath(),
        s1.getSum(), s1.getAver());
  }
}










