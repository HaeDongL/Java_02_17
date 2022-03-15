//package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PostDataATagServletMapping extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		//Client Form Data �ѱ۵��ڵ�
		res.setCharacterEncoding("EUC_KR");
		
		//�Ʒ��� �ν��๮�� servlet���� client�� html�� ���۽� �ʼ� �ڵ�
		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();
		
		//client Form Data ó��
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");
		
		//Client form Data ó�� ���Ȯ��
		System.out.println(clientName+":"+clientAddr);
		
		out.println("<html>");
		out.println("<head><title>GetData.java</title></head>");
		out.println("<body>");
		
		out.println("<h2>Get Test</h2>");
		out.println("<li>�̸�: "+clientName);
		out.println("<li>�ּ� : "+clientAddr);
		
		out.println("<p><p><a href='/edu/postDataATagServletMapping.html'>�ڷ�</a>");
		
		//==> <a>�±׸� �̿��Ͽ� Query���ڿ� ����
		out.println("<p><a href='/edu/PostDataATagServletMapping?name=ȫ�浿&addr=����'>"+"�ڱ��ڽ�</a>");
		out.println("</body>");
		out.println("</html>");
	}
}