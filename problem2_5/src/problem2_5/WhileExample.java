package problem2_5;

public class WhileExample {

	public static void main(String[] args) {
		//무한 루틴을 사용하여 1~10까지 출력하도록 하고 짝수와 홀수로 나누어 출력
		int count=1;
		
		while(true) {
			if(count%2 ==0) {
				System.out.print(count);
			}
			count++;
			if(count==10) {
				count =1;
				System.out.println();
				while(count<=10) {
					if(count%2 != 0) {
					System.out.print(count);
					}
					count ++;
				}
				break;
			}
		}
	}
}




