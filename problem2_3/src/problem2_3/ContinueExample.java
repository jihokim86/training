package problem2_3;

public class ContinueExample {

	public static void main(String[] args) {
		//50~100 사이 값중 3의 배수중 2의 배수를 제외하고 출력
		
		for(int i=50;i<=100;i++) {
			
			if(i%3==0) {
				if(i%2==0) {
					continue;
				}
				System.out.println(i);
			}
		}//end of for
	}
}
