package problem1_7;

public class SquareFloat {

	public static void main(String[] args) {
		//0.0부터 1.0까지 0.001 단위로 증가시키며 제곱 표시(반복을 float형으로 제어)
		System.out.println("x\tx의제곱");
		System.out.println("-------------------");
		
		for(float i =0.0f; i<=1.0 ; i+=0.001) {
			System.out.printf("%.3f\t%.7f\n",i,i*i);
		}
	}

}
