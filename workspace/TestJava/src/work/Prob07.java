class Prob07 
{
	//Main Method
	public static void main(String[] args) 
	{

		// �Ʒ��� �����Ͻÿ�
		int number = Integer.parseInt(args[0]);
		if(!(number == 0 || number < 0 || number % 2 == 0)){
		int count = 1;

			
			for(int i=number; i>0; i--){
				if(i < number){
					for(int k=number; k>i; k--){
						System.out.print(" ");
					}//infor1

					for(int j=1; j<=i-count; j++){
						System.out.print("*");
					}//infor2
					count++;
					
				}else{
					for(int j=1; j<=i; j++){
					System.out.print("*");
					}
				}//if - else
				
				System.out.println();
			}//for
			
				
				

				
		
		}else {
			System.out.println("0���� ū Ȧ���� �Է� �����մϴ�.");
		}//if - else
	}//main
}//class
