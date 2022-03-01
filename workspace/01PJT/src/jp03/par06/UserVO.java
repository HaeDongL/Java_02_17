package jp03.par06;

import java.io.*;

/*
 * FileName:User.java
 * 
 * o ȸ�������� ������ �ִ� UserVO :: ValueObject ==> RMI/EJB(Value Object Pattem)
 * o ȸ�������� ���� UserVO instance �� file �� ����ɰ��̸�..
 * o ��ü�� ������ڿ�, network �ڿ����� �̵��Ǳ� ���ؼ���
 * 		Serializable �̶�� marker interface�� �����ؾ� �Ѵ�. ==> ��ü����ȭ...
 */


public class UserVO implements Serializable {

			///Field
			private int no;
			private String name;
			
			///Constructor
			public UserVO() {
			}
			
			public UserVO(int no, String name) {
				this.no = no;
				this.name = name;
			}
			
			///Method
			//seter method
			public void setNo(int no) {
				
				this.no = no;
			}
			public void setName(String name) {
				this.name = name;
			}
			//getter method
			public int getNo() {
				return no;
			}
			public String getName() {
				return name;
			}
			
			@Override
			public String toString() {
				StringBuilder builder = new StringBuilder();
				builder.append("UserVO [no=");
				builder.append(no);
				builder.append(",name=");
				builder.append(name);
				builder.append("]");
				return builder.toString();
				
			}

	
	
	

}













