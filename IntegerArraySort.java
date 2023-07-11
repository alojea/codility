package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * given an array of integers
 * Move all the 0 to the left and 1 to the right
 * in 3 different ways
 */
public class IntegerArraySort {
    public static void main(String[] args) {
        Integer[] arrayOfIntegers = {0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1};
        Integer[] result = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1};

        System.out.println("Case1");
        Integer[] sortWayResult = sortWay(arrayOfIntegers);
        printResults(result, sortWayResult);

        System.out.println("Case2");
        Integer[] sortWayResult2 = arrayOfIntegers.clone();
        Arrays.sort(sortWayResult2);
        printResults(result, sortWayResult2);

        System.out.println("Case3");
        printResults(result, twoArraysSolution(arrayOfIntegers));

        System.out.println("Case4");
        printResults(result, indexesSolution(arrayOfIntegers));
    }

    private static Integer[] sortWay(Integer[] input) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(input));
        arrayList.sort(Integer::compareTo);
        return arrayList.toArray(new Integer[0]);
    }

    private static Integer[] twoArraysSolution(Integer[] input) {
        Integer[] arrayOfZeros = Arrays.stream(input)
                .filter(n -> n == 0).toArray(Integer[]::new);
        Integer[] arrayOfOnes = Arrays.stream(input)
                .filter(n -> n == 1).toArray(Integer[]::new);

        return Stream.concat(Arrays.stream(arrayOfZeros),
                Arrays.stream(arrayOfOnes)).toArray(Integer[]::new);
    }

    private static Integer[] indexesSolution(Integer[] input) {
        for(int i = 0; i < input.length -1 ; i++) {
            for (int j = i + 1 ; j < input.length; j++)
            if (input[i] > input[j]) {
                int temp = input[j];
                input[j] = input[i];
                input[i] = temp;
            }
        }
        return input;
    }

    private static void printResults(Integer[] results, Integer[] input) {
        if (Arrays.compare(input, results) == 0) {
            System.out.println("OK");
        } else {
            System.out.println("FAILED");
        }
        Arrays.stream(input).forEach(val -> System.out.println(val));
    }
}
