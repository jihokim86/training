package test1;

public class RankStudent {

	public static void main(String[] args) {
		//������ϱ�
		int[] scores = {70,98,45,60,83};
		
		int myRank[] = new int[5];
		
		for(int i=0; i<scores.length;i++) {
			myRank[i]=1; //0��° ���� ���� 1(1��)�� ����
			for(int j=0;j<scores.length;j++) {
				if(scores[i]<scores[j]) {
					myRank[i] +=1;
				}
			}
		}
		for(int i=0; i<scores.length;i++) {
			System.out.println("����:"+scores[i]+"\t"+"���:"+myRank[i]);
		}
	}//end of main
}//end of class
