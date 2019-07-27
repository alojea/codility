package codility.lessons.com;

public class FrogJmp {

	public static int solution(int X, int Y, int D) {
		
		double result = (double)(Y-X)/D;
	
		
		return (int)Math.ceil(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 10;
		int Y = 85;
		int D = 30;
		
		System.out.print("The minimal number of jumps is "+ solution(X,Y,D));
	}

}
