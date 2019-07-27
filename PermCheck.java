package codility.lessons.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class PermCheck {
	
	public static int solution(int[] A) {
		ArrayList<Integer> elements = new ArrayList<Integer>();
		
		int evaluateElement = 1;
		
		for(int element:A) {
			elements.add(element);
		}
		
		Collections.sort(elements);
		
		for(int i=0;i<elements.size();i++) {
			if(elements.get(i)!=(i+1)) {
				return 0;
			}
		}

		return 1;

		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {2,1,3};
		
		if(solution(A) == 1) {
			System.out.print("Permutation");
		}else {
			System.out.print("Non Permutation");
		}
	}

}
