package com.eomcs.concurrent2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam0110 {
  public static void main(String[] args) {
    ExecutorService threadPool = Executors.newFixedThreadPool(3);
    threadPool.execute(() ->System.out.printf("%s 스레드 실행!",
        Thread.currentThread().getName()));

    threadPool.shutdown();
    System.out.println("main() 종료!");
  }
}
