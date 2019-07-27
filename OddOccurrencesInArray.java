package codility.lessons.com;

public class OddOccurrencesInArray {
	
	@SuppressWarnings("null")
	public static int solution(int[] A) {
		int unpaired = 0;
		char[] paired_position = new char[A.length];
		
		//Initialization
		for(int i=0; i<A.length; i++) {
			paired_position[i] = 'N';
		}
		

		
		for(int i=0; i<A.length; i++) {
			for(int j=i+1; j<A.length;j++) {
				if(A[i]==A[j] && paired_position[j] == 'N') {
					paired_position[i]='Y';
					paired_position[j]='Y';
					break;
				}
			}
			
		}
		
		for(int i=0; i<paired_position.length; i++) {
			if(paired_position[i]=='N') {
				unpaired = A[i];
			}
		}
		
		return unpaired;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {9,3,9,3,9,7,9};
		
		System.out.print("Unpaired element=" + solution(A));

	}

}
