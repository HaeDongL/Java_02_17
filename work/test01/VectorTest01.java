import java.util.Vector;

class VectorTest01 
{
	public static void main(String[] args) 
	{
		Vector vec = new Vector(10,10);

		vec.add("1.");
		vec.add("2.");
		System.out.println(vec.elementAt(0));
		vec.remove(0);// 0��° ������ 1 ������ 2�� ����
		System.out.println(vec.elementAt(0));

		vec.setElementAt(123,1);
		System.out.println(vec.elementAt(0));
		vec.insertElementAt(456,0);
		System.out.println(vec.elementAt(1));
	}
}
