package problem1_7;

public class DoubleArray {

	public static void main(String[] args) {
		//자료형은 double이고 요소수가 5인 배열을 생성하고
		// 이 배열의 모든 요소를 표시하는 프로그램을 작성
		double[] a= new double[5];
		for(int i=0; i<a.length;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
	}

}
