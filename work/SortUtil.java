class SortUtil

{

	public int[] ascending(int[] inputNumbers){
		//implements ascending method
		for(int i=0; i<inputNumbers.length; i++){
			for(int j=i; j<inputNumbers.length; j++){
				if(inputNumbers[i]>inputNumbers[j]){
					int temp = inputNumbers[i];
					inputNumbers[i] = inputNumbers[j];
					inputNumbers[j] = temp;
				}//if
			}//infor
		}//outfor
		return inputNumbers;
	}

	public static void main(String[] args) 
	{
		
		SortUtil util = new SortUtil();
		int[] numbers = new int[]{7, 5, 2, 19, 34, 51, 32, 11, 67, 21};

		numbers = util.ascending(numbers);

		for(int i=0; i< numbers.length; i++){
			System.out.print(numbers[i]);

			if(i != numbers.length-1){
				System.out.print(",");
			}else {
				System.out.println("");
			}
		}//for
		System.out.println("Successful!!");
	}//main
}//class
