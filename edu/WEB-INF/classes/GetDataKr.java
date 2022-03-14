//package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetDataKr extends HttpServlet{
	//1. Client Get ������� Request :: doGet() method O/R
	//2. service() O/R ����
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
		req.setCharacterEncoding("EUC_KR");
		//�Ʒ��� �ν��๮�� servlet���� client�� html�� ���۽� �ʼ� �ڵ�
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//client form data(QueryString::name=value)ó��(APIȮ��)
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");
		
		//client form data ���(�����??)
		System.out.println(clientName+":"+clientAddr);
		
		/*===========================================================
		 * ==> Tomcat 7.x���� Get ��� �ѱ� �ذ���
		 * 16���� ���ڵ��� client form data �ѱ� ���ڵ�
		 * String clientNameKo = this.convertKo(clientName);
		 * String clientAddrKo = convertKo(clientAddr);
		 *client form data ���(�����??)
		 *System.out.println(clientNameKo+":"+clientAddrKo);
		 * ==========================================================
		 */
		
		out.println("<html>");
		out.println("<head><title>GetDataKr.java</title></head>");
		out.println("<body>");
		
		out.println("<h2>Get Test</h2>");
		out.println("<li>�̸�: "+clientName);
		out.println("<li>�ּ� : "+clientAddr);
		
		out.println("<p><p><a href='/edu/GetDataKr.html'>�ڷ�</a>");
		
		out.println("</body>");
		out.println("</html>");
	}
	
	/*===========================================================
	 * ==> Tomcat 7.x���� Get ��� �ѱ� �ذ���
	 * Method
	 * private String convertKo(String paramValue){
	 * 		String convertParamValue = null;
	 * 		try{
	 *		==> APIȮ��
	 *			byte[] b = paramValue.getBytes("8859_1");
	 *			convertParamValue = new String(b,"EUC_KR");
	 * 		}catch(UnsupportedEncodingException uee){
	 * 			System.out.println("�ѱ� ��ȯ�� Exception �߻�");
	 * 			uee.printStackTrace();
	 * 		}
	 * 		return convertParamValue;
	 * }
	 * ==========================================================
	 */
}
