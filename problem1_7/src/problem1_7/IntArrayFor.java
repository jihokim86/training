package problem1_7;

public class IntArrayFor {

	public static void main(String[] args) {
		//요소 개수가 5개인 int형 배열에 순서대로 5,4,3,2,1을 대입하는 
		//프로그램을 작성
		
		int[] a= new int[5];
		for(int i=0; i<a.length; i++) {
			a[i] = 5-i;
			System.out.println("a["+i+"]="+a[i]);
	}
  }
}
