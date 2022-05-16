package test1;

public class StudentName {

	public static void main(String[] args) {
		//문자열 출력
		
		String[] student = {"aaa","bbb","ccc","ddd","eee"};
		for(int i=0; i<student.length;i++) {
			System.out.println((i+1)+". "+student[i]);
		}
	}
}
