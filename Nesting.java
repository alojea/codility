package codility.lessons.com;

import java.util.Stack;

public class Nesting {

	public static int solution(String S) {

		Stack<Character> stack = new Stack<Character>();
		
		if(S.isEmpty()) {
			return 0;
		}

		for(int i=0; i<S.length();i++) {
			if(S.charAt(i) == '(') {
				stack.push(S.charAt(i));
			} else {
				if(S.charAt(i) == ')') {
					if(stack.isEmpty() || stack.peek()!='(') {
						return 0;
					} else {
						stack.pop();
					}
				}
			}
		}
		
		if(!stack.isEmpty()) {
			return 0;
		}
		
		return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "()((())";
		
		if(solution(A)==1) {
			System.out.print("Nested String");
		} else {
			System.out.print("No Nested String");
		}

	}

}
