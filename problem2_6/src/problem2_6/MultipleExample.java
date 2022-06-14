package problem2_6;

public class MultipleExample {

	public static void main(String[] args) {
		//1~20사이에서 2또는 3의 배수 출력
		for(int i=0; i<=20 ;i++) {
			if(i%2==0 || i%3==0) {
				System.out.println(i);
			}
		}
	}
}
