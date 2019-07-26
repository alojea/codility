/**
 * 
 */
package codility.lessons.com;

/**
 * @author alejandro
 *
 */
public class Iterations {
	
	public static int solution(int N) {
		
		String binaryConverted = Integer.toBinaryString(N);
		int maxZeros=0;
		int currentMaxZeros=0;
		char binaryArray[] = binaryConverted.toCharArray();
		
		for(int i=0; i<binaryArray.length; i++) {
			if(binaryArray[i] == '0') {
				currentMaxZeros++;
			} else {
				if(currentMaxZeros > maxZeros) {
					maxZeros = currentMaxZeros;
					currentMaxZeros = 0;
				}
			}
		}
		return maxZeros;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 3;
		String binaryNumber = Integer.toBinaryString(number);
		
		int result = solution(number); 
		
		if(result == 0) {
			System.out.print("No binary GAP in the number "+ number + "("+ binaryNumber +")" );
		} else {
			System.out.print("Binary GAP " + result + " in the number "+number + "("+ binaryNumber +")");
		}

	}

}
