package problem1_17;

//---동물클래스(ver2)---//
abstract class Animal {
	
	private String name;			//이름

	public Animal(String name) {	//생성자
		this.name = name;			//set으로 받기위해 주
	}
	
//	public Animal() {
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}

	public String getName() {		//이름확인
		return name;
	}
	
	public abstract void bark();	//짖기
	
	public abstract String toString(); //문자열 표현 반환
	
	public void introduce() {
		System.out.print(toString()+"이다.");
		bark();
	}
}


