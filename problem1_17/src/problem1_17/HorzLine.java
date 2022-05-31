package problem1_17;

public class HorzLine extends AbstLine{
	
	public HorzLine(int length) {
		super(length);  // 부모클래스에서 초기화를 했을텐데?????
	}

	@Override
	public String toString() {
		return "HorzLine(length:"+getLength()+")";
	} 
	//abstLine을 상속 받았기에 getLength메소드 사용이 가능
	
	//수평선을 긋는 매소드
	
	public void draw() {
		for (int i = 1; i < getLength(); i++) {
			System.out.print('-');
		}
		System.out.println();
	}

}
