//package servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 * FileName : HelloServletdoPost.java
 * Servlet Life Cycle ���� �� ���� ����
 * Servlet Hierarchy / Servlet API ����
 */


public class HelloServletdoPost extends HttpServlet{
	
	// init() ==> �ݹ� ���� method overriding on need
	
	//service() method Overriding ����
	
	//doPost() method Overrding
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		this.doPost(req,res);
	}

	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
			
			System.out.println("::servlet doPost() ����");
			System.out.println("Request Client IP : "+req.getRemoteAddr());
			
			//�ѱ�ó��
			res.setContentType("text/html;charset=EUC-KR");
			
			//PrintWriter �ν��Ͻ� ������ Encapsulation �� API ��� Stream ����
			PrintWriter out = res.getWriter();
			
			out.println("<html>");
			out.println("<head><title>hello Servlet</title></head>");
			out.println("<body>");
			out.println("English : HelloServlet");
			out.println("<p>");
			out.println("Korea : ��� ������");
			out.println("</body>");
			out.println("</html>");
			out.flush();
			out.close();
			
			System.out.println("::servlet doPost ����\n");
	
		}//end of service
}