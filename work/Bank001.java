
/*
	FileName : Bank.java
	1. abstract.class는 interface(기능의정의)와 달리 일반 공유 method와 Field를 갖을 수 있다.
*/

public abstract class Bank001 
{
	//Field
	private String name;

	//Constructor
	public Bank001(){

	}

	public Bank001(String name){
		this.name = name;
	}

	///Method
	// 은행명을 출력하는 display method 를 추상Method로 정의
	public abstract void display();
	
	public String getName(){
		return name;
	}
	public void setName(){
		this.name = name;
	}
}
