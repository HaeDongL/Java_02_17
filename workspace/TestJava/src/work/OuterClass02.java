//package jp02.part05;
/*
	FileName: OuterClass02.java
	
	<<Inner local Class�� ����>>
	1.Inner localClass�� method �� ������ local variable(Field?)�� ���� level
	2.�������� innerClass�� � ������ class�� �Ǵ��� Ȯ�� �� ��(~~~$1~~~.class)
*/

public class OuterClass02 
{

	///Field
	private String outer = "outerClass�� Field";

	///Constructor
	public OuterClass02(){

	}

	///Method
	public void outerMethod(){
	
		System.out.println("::"+this.getClass().getName()+"start..");
		final String localVariable = "OuterClass ���� outerMethod �� localVariable";
			


			//InnerLocalClass
		class InnerLocalClass
		{
			///Field
			private String inner = "innerClass�� Field";
			///Constructor
			public InnerLocalClass(){
			}

			///Method
			public void innerMethod(){
				System.out.println("==>"+this.getClass().getName()+"start..");
				//innerClass���� OuterClass�� �����ϱ�
				System.out.println(localVariable);
				System.out.println(outer);
				System.out.println(inner);
				System.out.println("==>"+this.getClass().getName()+"end..");

			}
		}

		System.out.println("::"+this.getClass().getName()+"start..");

		//inner local class�� �ѷ��� method ���� �ν��Ͻ� ��������
		InnerLocalClass ilc = new InnerLocalClass();
		ilc.innerMethod();


	}

	public static void main(String[] args) 
	{
		new OuterClass02().outerMethod();
	}
}