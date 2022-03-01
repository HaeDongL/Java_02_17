package t02_28;

class CellPhone01{
	
	///Field
	private String model;
	private double battery;
	///Constructor
	CellPhone01(){
	}
	public CellPhone01(String model) {
		super();
		this.model = model;
	}
	///Method
	void call(int time) {
		System.out.println("��ȭ�ð� : "+time);
		if(time < 0) {
			throw new IllegalArgumentException("��ȭ�ð��Է¿���");
		}else {
			this.setBattery(this.getBattery() - (time*0.5));
		}
		
	}
	
	void charge(int time) {
		System.out.println("���� �ð� : "+time);
		if(time < 0) {
			throw new IllegalArgumentException("�����ð��Է¿���");
		}else {
			this.setBattery(this.getBattery() + (time*3));	
		}
		
	}
	void printBattery() {
		System.out.println("���� ���͸� ��: "+this.getBattery());
	}
	
	public boolean equals(Object otherObject) {
		
		if(otherObject instanceof CellPhone01 && this.model.equals(((CellPhone01) otherObject).model)) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	///Get
	public String getModel() {
		return model;
	}
	
	public double getBattery() {
		return battery;
	}
	
	///Set
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setBattery(double battery) {
		this.battery = battery;
	}
	
}



public class CellPhoneMain {
	
	
	public static void main(String[] args) {
		
		CellPhone01 myPhone = new CellPhone01("SCH-600");
		
		myPhone.charge(20); //20�а� ������ �Ѵ�
		myPhone.printBattery();
		
		myPhone.call(300); //300�а� ��ȭ�� �Ѵ�.
		myPhone.printBattery();
		
		myPhone.charge(50);
		myPhone.printBattery();
		
		myPhone.call(40); //40�а� ��ȭ�� �Ѵ�.
		myPhone.printBattery();
		
		try {
			myPhone.call(-20);//��ȭ�ð��� �߸� �ԷµǾ���.
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
		CellPhone01 yourPhone = new CellPhone01("SCH-600");
		
		if(myPhone.equals(yourPhone)) {
			System.out.println("���� ���Դϴ�.");
		}else {
			System.out.println("�ٸ� ���Դϴ�.");
		}

	}


}