package codility.lessons.com;
//http://codility.com/demo/take-sample-test/

import java.util.Arrays;

public class CodilityDemoTask {
	
	public static int solution(int[] A) {
		int countPositives = 0;
		
		Arrays.sort(A);
		
		if(A.length == 1) {
			if(A[0]<=0) {
				return 1;
			}else {
				if(A[0]==1) {
					return 2;
				} else {
					return A[0]-1;
				}
			}
		}
			
		for(int i=0; i<A.length-1;i++) {
			
			if(A[i]>=0) {
				if(A[i+1]-A[i]>1) {
					return (A[i]+1);
				}
				countPositives++;
			}
		}
		
		if(countPositives == 0) {
			return 1;
		} else {
			return A[A.length-1]+1;			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] listForRotation = {1, 3, 6, 4, 1, 2};
		System.out.print(solution(listForRotation));
	}

}
