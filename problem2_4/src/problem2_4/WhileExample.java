package problem2_4;

public class WhileExample {
	public static void main(String[] args) {
		//10부터 1까지 출력하는 while문
		int a =10 ;
		while(true) {
			System.out.println(a);
			a--;
			if(a==0) {
				break;
			}
		}
}
}
