package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HtmlServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		req.setCharacterEncoding("EUC_KR");
		
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		String clientName = req.getParameter("name");
		String clientGen = req.getParameter("gender");
		String clientYear = req.getParameter("year");
		String clientMonth = req.getParameter("month");
		String clientDay = req.getParameter("day");
		String clientJob = req.getParameter("job");
		String clientPhone01 = req.getParameter("cellPhone01");
		String clientPhone02 = req.getParameter("cellPhone02");
		String clientPhone03 = req.getParameter("cellPhone03");
		String clientAddr = req.getParameter("addr");
		
		
		
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"EUC_KR\"");
		out.println("<title>HtmlServlet.html</title>");
		out.println("<body>");
		out.println("<ul>\r\n"
				+ "	<li>�̸�: "+clientName+"\r\n"
				+ "	<li>����: "+clientGen+"\r\n"
				+ "	<li>�������: "+clientYear+"��"+clientMonth+"��"+clientDay+"��\r\n"
				+ "	<li>����: "+clientJob+"\r\n"
				+ "	<li>�޴���: "+clientPhone01+"-"+clientPhone02+"-"+clientPhone03+"\r\n"
				+ "	<li>�ּ�: "+clientAddr+"\r\n"
				+ "</ul>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
		out.flush();
		out.close();
	}
	
}