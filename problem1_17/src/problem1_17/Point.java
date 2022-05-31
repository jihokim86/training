package problem1_17;

public class Point extends Shape{
	
	public Point() { //기본 생성자 일까??
	}

	@Override // 클래스 호출시 point 리턴함!
	public String toString() {
		return "Point";
	}
	
	@Override// 점을 그리는 매소드
	public void draw() {
		System.out.println('+');
	}
	
	
}
