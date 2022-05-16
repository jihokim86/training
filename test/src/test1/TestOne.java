package test1;

public class TestOne {

	public static void main(String[] args) {
//		int i =0;
//		for(;;) { //公茄风凭 //for(int k=0;;k++) 公茄风凭
//			i++;
//			System.out.println("i="+i);
//			
//			if(i>=10) {
//				break;
//			}
//		  }
		
		int i=0;
		while(true) {
			i++;
			if(i%2==0) continue;
			if(i>10) break;
				System.out.println(i);
			}
	}//end of main
}//end of class


