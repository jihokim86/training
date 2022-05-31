package problem1_17;


//직선을 나타내는 추상 클래스
public abstract class AbstLine extends Shape {
	private int length; // 직선을 길이

	public AbstLine(int length) {
//		this.length = length;// 생성자로 안받는건가??
		setLength(length);  //생성자 매개변수와 set함수까지?? 구지???
	}

	public int getLength() { //직선의 길이를 리턴
		return length;
	}
	
	public void setLength(int length) {  // setLength함수,매개변수있음
		this.length = length;	// 생성자에서 호출함, 필드값에 바로 저장안하는 이유는?
	}

	@Override // 길이 값이 있는 문자열을 리턴함.
	public String toString() {
		return "AbstLine (length=" + length + ")";
	}
	
	
	
}
