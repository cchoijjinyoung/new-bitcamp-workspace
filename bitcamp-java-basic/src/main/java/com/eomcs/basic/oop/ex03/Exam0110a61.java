package com.eomcs.basic.oop.ex03;


public class Exam0110a61 {

static class Member {
  String id;
  String password;
  int type;
}

public static void main(String[] args) {
 final int GUEST = 0;
 final int MEMBER = 1;
 final int MANAGER = 2;

  Member m1 = new Member();
  m1.id = "aaa";
  m1.password = "1111";
  m1.type = GUEST;

  Member m2 = new Member();
  m2.id = "bbb";
  m2.password = "2222";
  m2.type = MEMBER;

}
  }







