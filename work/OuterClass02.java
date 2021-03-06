//package jp02.part05;
/*
	FileName: OuterClass02.java
	
	<<Inner local Class의 이해>>
	1.Inner localClass는 method 와 내부의 local variable(Field?)과 같은 level
	2.컴파일후 innerClass는 어떤 형태의 class가 되는지 확인 할 것(~~~$1~~~.class)
*/

public class OuterClass02 
{

	///Field
	private String outer = "outerClass의 Field";

	///Constructor
	public OuterClass02(){

	}

	///Method
	public void outerMethod(){
	
		System.out.println("::"+this.getClass().getName()+"start..");
		final String localVariable = "OuterClass 내의 outerMethod 의 localVariable";
			


			//InnerLocalClass
		class InnerLocalClass
		{
			///Field
			private String inner = "innerClass의 Field";
			///Constructor
			public InnerLocalClass(){
			}

			///Method
			public void innerMethod(){
				System.out.println("==>"+this.getClass().getName()+"start..");
				//innerClass에서 OuterClass로 접근하기
				System.out.println(localVariable);
				System.out.println(outer);
				System.out.println(inner);
				System.out.println("==>"+this.getClass().getName()+"end..");

			}
		}

		System.out.println("::"+this.getClass().getName()+"start..");

		//inner local class를 둘러싼 method 에서 인스턴스 생성가능
		InnerLocalClass ilc = new InnerLocalClass();
		ilc.innerMethod();


	}

	public static void main(String[] args) 
	{
		new OuterClass02().outerMethod();
	}
}
