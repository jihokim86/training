package problem1_17;


//수직선 생성하는 클래스
public class VertLine extends AbstLine{
	
	public VertLine(int length) {
		super(length);  // 부모클래스에서 초기화를 했을텐데?????
	}

	@Override
	public String toString() {
		return "VertLine(length:"+getLength()+")";
	}
	
	public void draw() {
		for(int i=1 ; i<getLength();i++) {
			System.out.println("|");
		}
	}
	
}
