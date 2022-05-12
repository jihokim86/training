package problem1_2;
import java.util.Scanner;

public class Min3 {

	public static void main(String[] args) {
		// 3개의 정수 중 최소값 구하기
		Scanner input = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하시면 그중 최소값이 출력됩니다.");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int min;
		
		if(a>=b) {
			min=b;
		}else {
			min=a;
		}
		if(min>=c) {
			min=c;
		}
		System.out.println("입력한 정수중 최소 값은 "+min+" 입니다.");
	input.close();
	}

}
