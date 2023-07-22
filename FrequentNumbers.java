package codility;

import java.util.*;

/**
 * In array of numbers how many times a number appear in the list
 *
 *   example: 1, 2, 3, 5, 1, 3, 9, 0, 2, 2, 2, 1
 *
 *   t=1 -> 0, 5, 9
 *   t=2 -> 3
 *   t=3 -> 1
 *   t=4 -> 2
 */
public class FrequentNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 1, 3, 9, 0, 2, 2, 2, 1};
        Map<Integer, Integer> result = new HashMap<>();

        int[] numbersWithNoDuplicates = Arrays.stream(numbers).distinct().toArray();
        for (Integer number:numbersWithNoDuplicates) {
            int count = 0;
           for (int i=0; i<numbers.length; i++) {
               if (numbers[i] == number) {
                   count++;
               }
           }
            result.put(number, count);

        }

        result.forEach((value, key) -> System.out.printf("(%s,%s)", value, key));


        }
}
