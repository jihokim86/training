package problem1_9;

public class PrintArrayVariable {

	public static void main(String[] args) {
		//배열 변수의 값을  표시하는 프로그램을 작성
		int[] a = new int[5];
		System.out.println("a="+a);
		a=null;
		System.out.println("a="+a);
	}

}
