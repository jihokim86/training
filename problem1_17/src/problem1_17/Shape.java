package problem1_17;
/*
 * shape 클래스는 도형의 개념을 나타내기 위한 추상 클래스이다.
 * 추상클래스는 이 클래스의 인스턴스를 생성할 수 없다.
 * 추상클래스는 미완성의 클래스. 상속을 통해 완성한다?
 */
public abstract class Shape {
	
	public abstract String toString();
	//도형의 정보를 나타내는 문자열을 반환하는 추상 매소드
	
	public abstract void draw();
	//도형을 그리기 위한 추상 메소드
	
	public void print() {
		System.out.println(toString());
		draw();
	}
	/*
	 * 도형 정보를 표시하고 도형 자체를 그린다.
	 * 1. toString 매소드가 반환하는 문자열을 표시하고 줄바꿈
	 * 2. draw매소드를 호출해서 도형을 그림
	 */
	
}
