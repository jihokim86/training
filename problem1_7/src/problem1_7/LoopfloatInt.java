package problem1_7;

public class LoopfloatInt {

	public static void main(String[] args) {
		//0.0부터 1.0까지 0.001단위로 증가시켜 가며 표시
	System.out.println("float\t\tint");
	System.out.println("---------------------");
	
	float x = 0;
	for(float i =0; i<=1000;i++,x+=0.001f) {
		System.out.printf("%.7f  ,  %.7f\n",x,(float)i/1000);
	}
	}
}
