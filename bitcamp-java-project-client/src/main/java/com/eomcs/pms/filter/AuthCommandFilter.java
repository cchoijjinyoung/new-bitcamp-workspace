package com.eomcs.pms.filter;

import java.util.Map;
import com.eomcs.pms.handler.Request;

// 필터 역할 :
// - 로그인 하지 않은 경우 커멘ㄷ

public class AuthCommandFilter implements CommandFilter {

  @Override
  public void doFilter(Request request, FilterChain next) throws Exception {
    Map<String, Object> context = request.getContext();
    if (request.getCommandPath().equalsIgnoreCase("/login")
        || request.getContext().get("loginUser") != null) {
      next.doFilter(request);
    } else {
      System.out.println("로그인이 필요합니다");
    }

  }


}
