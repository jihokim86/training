package test1;

public class test333 {

	public static void main(String[] args) {
		
		int[] myRank = new int[5];
		int[] sum = new int[5];
		 for(int i=0; i<sum.length;i++) {
				myRank[i]=1; //0번째 방의 값을 1(1등)을 넣음
				for(int j=0;j<sum.length;j++) {
					if(sum[i]<sum[j]) {
						myRank[i] +=1;
						System.out.println("1");
					}
				}
			}

	}

}
