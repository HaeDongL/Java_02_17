import java.util.Scanner;

public class TestRectangle 
{
		///Field
		String color;
		int width;
		int length;
		int area;
		int perimeter;
		///Constructor
		public TestRectangle(){
		}
		///Method
		/// setter
		public void setColor(String color){
			this.color = color;
		}
		public void setWidth(int width){
			this.width = width;
		}
		public void setLength(int length){
			this.length = length;
		}
	
		
		///getter
		public String getColor(){
			return color;
		}
		
		public int getWidth(){
			return width;
		}
		public int getLength(){
			return length;
		}
		
		public int area(int width, int length){
			area = width * length;
			return area;
		}

		public int perimeter(int width, int length){
			perimeter = (width+length)*2;
			return perimeter;
		}


		//main method
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);

		TestRectangle rec1 = new TestRectangle();
		System.out.print("첫번째 직사격형의 색깔: ");
		rec1.setColor(keyboard.next());

		System.out.print("첫번째 직사격형의 가로: ");
		rec1.setWidth(keyboard.nextInt());

		System.out.print("첫번째 직사각형의 세로: ");
		rec1.setLength(keyboard.nextInt());

		

		TestRectangle rec2 = new TestRectangle();
		System.out.print("두번째 직사격형의 색깔: ");
		rec2.setColor(keyboard.next());

		System.out.print("두번째 직사격형의 가로: ");
		rec2.setWidth(keyboard.nextInt());

		System.out.print("두번째 직사각형의 세로: ");
		rec2.setLength(keyboard.nextInt());

		int rec1w = rec1.getWidth();
		int rec1l = rec1.getLength();
		int rec2w = rec2.getWidth();
		int rec2l = rec2.getLength();



		System.out.println(rec1.getColor()+" 직사각형의 넓이는 "
		+rec1.area(rec1w, rec1l)+"이고 둘레는 "+
			rec1.perimeter(rec1w, rec1l)+" 입니다.");

		System.out.println(rec2.getColor()+" 직사각형의 넓이는 "
		+rec2.area(rec2w, rec2l)+"이고 둘레는 "+
			rec2.perimeter(rec2w, rec2l)+" 입니다.");

		//TODO 1) 두 직사각형의 넓이를 비교하십시오.
	
		if(rec1.area(rec1w, rec1l) > rec2.area(rec2w, rec2l)){
			System.out.println("넓이는 "+rec1.getColor()+" 직사각형이 더 큽니다.");
		}else if(rec1.area(rec1w, rec1l) < rec2.area(rec2w, rec2l)) {
			System.out.println("넓이는 "+rec2.getColor()+" 직사각형이 더 큽니다.");
		}else {
			System.out.println("넓이는 같습니다.");
		}

		if(rec1.perimeter(rec1w, rec1l) > rec2.perimeter(rec2w, rec2l)){
			System.out.println("둘레는 "+rec1.getColor()+" 직사각형이 더 큽니다.");
		}else if(rec1.perimeter(rec1w, rec1l) < rec2.perimeter(rec2w, rec2l)) {
			System.out.println("둘레는 "+rec2.getColor()+" 직사각형이 더 큽니다.");
		}else {
			System.out.println("둘레는 같습니다.");
		}


	}//main
}//class
