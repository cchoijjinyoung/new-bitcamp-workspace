// 상속 - 상속하지 않고 기능 추가 II
package com.eomcs.oop.ex05.d;

public class Exam01 {
  public static void main(String[] args) {
    // 새 프로젝트에서는 제조사, 모델명, 수용인원 외에
    // 썬루프 장착여부, 자동변속 여부를 추가적으로 저장하고 싶다!
    //
    // 방법2) 기존 코드를 복사하여 새 클래스(Car2)를 만든다.
    //       문제점:
    //       => 같은 일을 하는 여러 클래스가 존재하게 되면 관리하기가 힘들다!
    //       => 만약 원본 코드에 버그가 있으면 버그도 복사하게 된다.
    //          따라서 버그를 고칠 때는 복사한 모든 소스 파일을 찾아 고쳐야 한다.
    Sedan c = new Sedan("비트자동차", "티코", 5, true, true);

    System.out.println(c.model);
    System.out.println(c.maker);
    System.out.println(c.capacity);
    System.out.println(c.auto);
    System.out.println(c.sunroof);



  }
}




