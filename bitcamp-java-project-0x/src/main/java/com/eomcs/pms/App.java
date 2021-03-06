package com.eomcs.pms;

import java.util.Scanner;
import java.sql.Date;

// 1) 낱개의 변수를 사용하여 여러 회원 정보 처리하기 - 배열 미사용

// 2) 조건문을 사용하여 입출력 제어하기
// - 필요한 만큼만 입력 받고 출력하고 싶다.

// 3) 배열을 사용하여 여러 개의 값을 다루기
// - 배열을 사용하면 간단하게 여러 개의 변수를 선언할 수 있다.

// 4) 반복문을 사용하여 여러개의 값을 다루기
// - 반복문을 사용하면 같은 코드를 중복해서 작성할 필요가 없다.

// 5) 배열 개수를 변수에서 관리하기
// - 변수의 값만 바꾸면 배열 개수를 바로 변경할 수 있어 편하다.

// 6) 상수를 사용하여 초기 값을 변경하지 못하게 막기
// - 변수는 중간에 값을 바꿀 수 있기 때문에 값을 바꾸지 말아야 하는 경우
//   상수로 선언한다.

// 7) 매서드를 사용하여 코드를 분리하기
// - 매서드를 사용하면 기능 별로 코드를 별도의 블럭으로 분리할 수 있다.
//   작은 단위로 코드가 분리되면 관리하기 쉽다.

// 8) 클래스를 사용하여 데이터를 담을 메모리를 정의한다.
// - 번호, 이름, 이메일 등 각각의 데이터를 낱개로 다루는 것 보다
//   하나의 데이터로 묶어서 다루면 값을 다루기가 편하다.
public class App {
  
  static class Member {
    int no;
    String name;
    String email;
    String password;
    String photo;
    String tel;
    Date now;
  }
  
  static int count = 0;
  static final int MAX_LENGTH = 5;
  static Member[] members = new Member[MAX_LENGTH];
  
  public static void main(String[] args) {
    
    System.out.println("[회원]");
    
    inputMembers(); // 별도의 블록으로 분리한 코드를 실행하기
    
    System.out.println("------------------------------");
    
    printMembers();
    }
  
  static void inputMembers() {
    Scanner keyInput = new Scanner(System.in);
    long currentMillis = 0;
    for (int i = 0; i < MAX_LENGTH; i++) {
      
      count++;
      Member m = new Member();
      
      System.out.print("번호? ");
      m.no = keyInput.nextInt();
      keyInput.nextLine();
      
      System.out.print("이름? ");
      m.name = keyInput.nextLine();
      
      System.out.print("이메일? ");
      m.email = keyInput.nextLine();
      
      System.out.print("암호? ");
      m.password = keyInput.nextLine();
      
      System.out.print("사진? ");
      m.photo = keyInput.nextLine();
      
      System.out.print("전화? ");
      m.tel = keyInput.nextLine();
      
      currentMillis = System.currentTimeMillis(); //1970-1-1 00:00:00 에서 경과 된 밀리초     
      m.now = new Date(currentMillis);
      
      members[i] = m;
      
      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response= keyInput.nextLine(); 
      
      if (response.equalsIgnoreCase("y") == false) {
        break; //반복문을 멈춰라.
      }
    }   keyInput.close();
    
  }
  static void printMembers() {
    for (int i = 0; i < count; i++) {
      Member m = members[i];
      
      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n",
          m.no, m.name, m.email, m.password, m.photo, m.tel, m.now.toString());
    }
  }
}
    
    
    