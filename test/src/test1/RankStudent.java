package test1;

public class RankStudent {

	public static void main(String[] args) {
		//등수구하기
		int[] scores = {70,98,45,60,83};
		
		int myRank[] = new int[5];
		
		for(int i=0; i<scores.length;i++) {
			myRank[i]=1; //0번째 방의 값을 1(1등)을 넣음
			for(int j=0;j<scores.length;j++) {
				if(scores[i]<scores[j]) {
					myRank[i] +=1;
				}
			}
		}
		for(int i=0; i<scores.length;i++) {
			System.out.println("점수:"+scores[i]+"\t"+"등수:"+myRank[i]);
		}
	}//end of main
}//end of class
