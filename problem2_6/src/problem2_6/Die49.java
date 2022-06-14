package problem2_6;

public class Die49 {

	public static void main(String[] args) {
		//주사위 두 개로 만든 숫자의 합과 곱을 구구단처럼 출력하자.
		//멤버 메소드와 static메소드의 사용상 차이점을 이해한다.
		
		//외부 클래스에 접근하기 위해서는 객체를 생성해야한다.
		Die die = new Die(); //객체생성
		die.addDie();
		die.multiDie();
		
		
		//static 클래스는 객체생성 없이 Class. 으로 클래스에 접근가능하다
		Die.addDiestatic();
		Die.multiDiestatic();
	}

}

class Die{
	public void addDie() {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				System.out.println(i+"+"+j+"="+(i+j));
			}
		}
		System.out.println("==============");
	}
	
	public void multiDie() {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
	
	public static void addDiestatic() {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				System.out.println(i+"+"+j+"="+(i+j));
			}
		}
		System.out.println("==============");
	}
	
	public static void multiDiestatic() {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
}
