package ex12;

public class Cartest {

	public static void main(String[] args) {
		//객체 생성
		
		Car p = new Car("기아자동차", "트럭");
		Car q = new Car("기아자동차", "트럭");
		
		System.out.println(p==q); //true? false?
		System.out.println(p);
		System.out.println(q);
		
//		System.out.println(car1.name);
//		System.out.println(car1.ssn);
//		
////		car1.name= "현대자동차";
//		car2.name="현대자동차";
//		
//		System.out.println(car1.name);
//		System.out.println(car2.name);
		
	}

}
