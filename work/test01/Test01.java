class className01
{

}


class className02 extends className01
{

}

class classMode
{

}



public class Test01 
{
	public static void main(String[] args) 
	{
		className01 cn = new className02(); // Polymorphism 레퍼런스 묵시적형변환

		Object ob = cn; // 현재 묵시적 형변환에 의한 Object타입

		classMode cm = (classMode)ob;

		className02 cn2 = (className02)cn; //일반적인 상속간의 명시적 형변환
		
		
	}
}
