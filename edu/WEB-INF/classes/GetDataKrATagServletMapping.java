//package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetDataKrATagServletMapping extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		/*===========================================================
		 * ==> Tomcat 8.x�̻� Get ��� �ѱ� �ذ���
		 * ==> servev.xml ���� ����
		 * <Connector port="8080" protocol="HTTP/1.1"
		 * 		connectionTimeout="20000"
		 * 		redirectPort="8443"
		 * 		useBodyEncodingForURI="true"/> <== �߰�
		 * ==========================================================
		 */
		res.setCharacterEncoding("EUC_KR");
		//�Ʒ��� �ν��๮�� servlet���� client�� html�� ���۽� �ʼ� �ڵ�
		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();
		
		//client���� ���۵Ǿ� ���� data(QueryString::name=value)ó��(APIȮ��)
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");
		
		//clien�� ���� ���� data ���(����� ����??)
		System.out.println(clientName+":"+clientAddr);
		
		out.println("<html>");
		out.println("<head><title>GetDataKrATag.java</title></head>");
		out.println("<body>");
		
		out.println("<h2>Get Test</h2>");
		out.println("<li>�̸�: "+clientName);
		out.println("<li>�ּ� : "+clientAddr);
		
		out.println("<p><p><a href='/edu/getDataKrATagServletMapping.html'>�ڷ�</a>");
		//==> <a>�±׸� �̿��Ͽ� Query���ڿ� ����
		out.println("<p><a href='/edu/GetDataKrATagServletMapping?name=ȫ�浿&addr=����'>"+"�ڱ��ڽ�</a>");
		out.println("</body>");
		out.println("</html>");
	}
}