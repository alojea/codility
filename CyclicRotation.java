package codility.lessons.com;

public class CyclicRotation {
	
	public static int[] solution(int[] A, int K) {
		int[] finalList = new int[A.length];
		
		for(int i=0; i<A.length;i++) {
			finalList[i]= A[i];			
		}
		
		
		for(int i=0; i<K;i++) {
			for(int j=0; j<A.length; j++) {
				if(j == A.length-1) {
					finalList[0] = A[j];
					break;
				} else {
					finalList[j+1]=A[j];					
				}
			}
			for(int k=0;k<A.length;k++) {
				A[k] = finalList[k]; 				
			}
		}
		
		for(int i=0; i<finalList.length;i++) {
			System.out.print(finalList[i]);			
		}
		
		return finalList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] listForRotation = {3, 8, 9, 7, 6};
		int k = 3; 
		
		
		solution(listForRotation, k);
	}

}
