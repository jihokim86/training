package problem1_2;
import java.util.Scanner;

public class Med3 {

	public static void main(String[] args) {
//입력받은 3개의 정수 값 중 중앙값을 구해서 표시
		Scanner input = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하시면 그중 중앙값이 출력됩니다.");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int med=0;
		
		if(a>=b && a<=c) {
			med=a;		
		}
		if(b>=a && b<=c) {
			med=b;
		}
		if(c>=a && c<=b) {
			med=c;
		}
		if(a<=b && a>=c) {
			med=a;		
		}
		if(b<=a && b>=c) {
			med=b;
		}
		if(c<=a && c>=b) {
			med=c;
		}
		
		System.out.println("입력한 정수 값 중 중앙값은 "+ med+ " 입니다.");
	input.close();
	}
}
