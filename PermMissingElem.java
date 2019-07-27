package codility.lessons.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermMissingElem {
	
	public static int solution(int[] A) {
		ArrayList<Integer> elements = new ArrayList<Integer>();
		int evaluateElement = 1;
		
		if(A.length == 0) {
			return evaluateElement;
		}
		
		for(int i=0; i<A.length; i++) {
			elements.add(A[i]);
		}
		if(!elements.isEmpty()) {
			Collections.sort(elements);			
		}
		
		 
		while(elements.contains(evaluateElement)) {
			evaluateElement++;
		}
		
		return evaluateElement;
	}

	public static void main(String[] args) {
		int[] A = {1,2,4};
		// TODO Auto-generated method stub
		System.out.print("Unpaired element=" + solution(A));

	}

}
