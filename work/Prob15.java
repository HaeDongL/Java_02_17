class Prob15
{//02.22
	public static void main(String[] args) 
	{
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";

		//���α׷� ������ ����
		//���� ����'a'�� �������� 97�̸�, 'z'�� 122�Դϴ�.
		//char c = 'a';
		// int i = (int)c;
		//char c1 = (char)i;
		
		for(int i=0; i<sourceString.length(); i++){
			int number;
			char currentChar = sourceString.charAt(i);
			if(currentChar != ' '){
				number = (int)currentChar;
				if(currentChar == 'x' || currentChar == 'y' || currentChar == 'z'){
					encodedString += (char)(number-23);
				}else {
					encodedString += (char)(number+3);
				}
			}
			encodedString += currentChar;
		}
		System.out.println("��ȣȭ�� ���ڿ�: "+sourceString);
		System.out.println("��ȣȭ�� ���ڿ�: "+encodedString);

	}
}
