package com.eomcs.pms.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;

@WebServlet("/auth/login")
public class LoginServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // 클라이언트 전용 보관소(세션)를 준비한다.
    HttpSession session = request.getSession();

    // 클라이언트로 데이터를 출력할 때 사용할 스트림 준비
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head><title>로그인</title></head>");
    out.println("<body>");

    try {
      out.println("<h1>로그인</h1>");

      if (session.getAttribute("loginUser") != null) {
        out.println("<p>로그인 된 상태입니다.</p>");

      } else {
        // 클라이언트가 보낸 데이터를 꺼낸다.
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // 서블릿이 로그인 작업에 사용할 도구를 준비한다.
        ServletContext ctx = request.getServletContext();
        MemberService memberService = (MemberService) ctx.getAttribute("memberService");

        Member member = memberService.get(email, password);
        if (member == null) {
          out.println("<p>사용자 정보가 맞지 않습니다.</p>");

        } else {
          // 로그인이 성공했으면 회원 정보를
          // 각 클라이언트의 전용 보관소인 session에 저장한다.
          session.setAttribute("loginUser", member);
          response.sendRedirect("../index.html");
          return;
//          request.getRequestDispatcher("/index.html").forward(request, response);
//          return;
        }
      }

    } catch (Exception e) {
      request.setAttribute("exception", e);
      request.getRequestDispatcher("/error").forward(request, response);
      return;
    }

    out.println("</body>");
    out.println("</html>");

    response.setHeader("Refresh", "1;url=../index.html");
  }
}
