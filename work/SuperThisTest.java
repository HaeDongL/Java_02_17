//package jb04.part05;
/*
	FileName : SuperThisTest.java
	==> ������ Method, Fleid ȣ�� �� �� �ִ� �����(Keyword)super
	==> ������ Method, Fleid ȣ�� �� �� �ִ� �����(Keyword)this
*/

class JuniorHighSchool{
	///Filed
	String name = "���ѹα����б�";

	///Constructor
	public JuniorHighSchool(){
	
	}

	///Method
	public void schoolName(){
		System.out.println("���б� �̸� : " +name);
	}

}

class HighSchool extends JuniorHighSchool{
	///Field
	String name = "���ѹα�����б�";

	///Constructor

	public HighSchool(){

	}

	///Constructor O/L
	public HighSchool(String str){
		name = str;
	}
	//==> ���� �����ڿ� �Ʒ��� �����ڸ� readability ���鿡�� ���캸��...
	 //public HighSchool(String name){
	//	this.name = name;
	//}

	///Method
	
	public void schoolName(){
		System.out.println("���б� �̸�: "+super.name);
		System.out.println("����б� �̸�: "+this.name);
		System.out.println("����б� �̸�: "+name);
	}

}//class

class SuperThisTest {


	///main
	public static void main(String[] args){
		
		HighSchool hs01 = new HighSchool();
		hs01.schoolName();

		System.out.println("============================");
		HighSchool hs02 = new HighSchool("�������б�");
		hs02.schoolName();

	}///main
}
