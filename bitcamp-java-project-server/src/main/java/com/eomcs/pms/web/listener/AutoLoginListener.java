package com.eomcs.pms.web.listener;

import java.util.Map;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;

@WebListener
public class AutoLoginListener implements ServletRequestListener {
  @SuppressWarnings("unchecked")
  @Override
  public void requestInitialized(ServletRequestEvent sre) {
    System.out.println("ㅋㅋ 자동 로그인!");
    try {
      HttpSession session = ((HttpServletRequest)sre.getServletRequest()).getSession();

      if (session.getAttribute("loginUser") == null) {

        Member member = new Member().setNo(1).setName().setEmail("chl@com");

        session.setAttribute("loginUser", member);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}