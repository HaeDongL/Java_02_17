package t02_25;

import java.util.*;

public class ArrayCopy {
	///Field
	
	///Constructor
	
	///Method
	
	public Vector<String>moveToVector(String[] datas){
		Vector<String> vec = new Vector<String>(datas.length,datas.length);
		
		for(int i=datas.length-1; i>=0; i--) {
			vec.add(datas[i]);
		}
		return vec;
	}
	
	public static void main(String[] args) {
		ArrayCopy ac = new ArrayCopy();
		String datas[] = {"1","2","3","4","5"};
		
		//Vector<String>result = ac.moveToVector(datas);
		List<String>result = ac.moveToVector(datas);
		
		System.out.println(result);
	}
	
}
