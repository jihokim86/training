package problem1_7;

public class DoubleArrayFor {

	public static void main(String[] args) {
		//요소 개수가 5인 double형 배열을 만들고 앞에서 부터
		//1.1,2.2,3.3,4.4,5.5를 대입해서 표시하는 프로그램을 작성
		double[] a = new double[5];
		
		for(int i =0 ; i<a.length;i++) {
			a[i] = i*1.1+1.1;
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}
