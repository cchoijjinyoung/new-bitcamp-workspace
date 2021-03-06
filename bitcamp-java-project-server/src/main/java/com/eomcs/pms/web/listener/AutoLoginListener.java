package com.eomcs.pms.web.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.eomcs.pms.domain.Member;

@WebListener
public class AutoLoginListener implements ServletRequestListener {
  @Override
  public void requestInitialized(ServletRequestEvent sre) {
    System.out.println("ㅋㅋ 자동 로그인!");
    HttpSession session = ((HttpServletRequest)sre.getServletRequest()).getSession();

    if (session.getAttribute("loginUser") == null) {
      Member member = new Member().setNo(13).setName("chl").setEmail("chl@com");
      session.setAttribute("loginUser", member);
    }
  }
}
