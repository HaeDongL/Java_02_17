class class01
{
	
	public void a(){
		System.out.println("class01");
	}

} 

class class02 extends class01
{
	public void a(){
		System.out.println("class02");
	}

	

}



public class classTest

{
	public static void main(String[] args) 
	{
		class01 c1 = new class02();

		
		
	}
}
