
public class Prob05 {
	public static void main(String[] args) {
		
		int[] array = {3,24,1,55,17,43,5};
		
		//�Ʒ��� �����Ͻÿ�
		System.out.println("[�迭�� ����]");
		for(int i=0; i<array.length; i++) {
			if(i == array.length -1){
				System.out.println(array[i]);
				break;
			}//if
			System.out.print(array[i]+",");
		}//for
		int temp;
		for(int i=0; i<array.length; i++) {
			for(int j=i; j<array.length; j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}//if
			}//infor
		}//outfor
		
		System.out.println("\n[Ŭ���� ������]");
		for(int i=0; i<array.length; i++) {
			if(i == array.length -1){
				System.out.println(array[i]);
				break;
			}//if
			System.out.print(array[i]+",");
		}//for
		

		
		
	}//main
}//class
