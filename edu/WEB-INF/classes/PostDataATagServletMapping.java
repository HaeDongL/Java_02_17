//package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PostDataATagServletMapping extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		//Client Form Data 한글디코딩
		res.setCharacterEncoding("EUC_KR");
		
		//아래의 두실행문은 servlet에서 client로 html을 전송시 필수 코딩
		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();
		
		//client Form Data 처리
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");
		
		//Client form Data 처리 출력확인
		System.out.println(clientName+":"+clientAddr);
		
		out.println("<html>");
		out.println("<head><title>GetData.java</title></head>");
		out.println("<body>");
		
		out.println("<h2>Get Test</h2>");
		out.println("<li>이름: "+clientName);
		out.println("<li>주소 : "+clientAddr);
		
		out.println("<p><p><a href='/edu/postDataATagServletMapping.html'>뒤로</a>");
		
		//==> <a>태그를 이용하여 Query문자열 전달
		out.println("<p><a href='/edu/PostDataATagServletMapping?name=홍길동&addr=서울'>"+"자기자신</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
