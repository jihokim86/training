package problem1_17;

//--- 개 클래스 (ver.2) 

class Dog extends Animal{
	
	private String type;
	
	public Dog(String name,String type) {
		super(name);
		this.type = type;
	}
	
//	public Dog() { //기본생성자
//	}
//	
	public void bark() {
		System.out.println("멍멍");
	}
	

	public String getType() {
		return type;
	}

//	public void setType(String type) {
//		this.type = type;
//	}

	@Override
	public String toString() {
		return type+"의"+getName();
	}
	
}
