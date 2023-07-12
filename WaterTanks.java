package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 *
 * Suppose you have an array of houses "-H-H-H",
 * each house needs to be close to a water tank on either its left or right side.
 * How many water tanks do you need? Water Tanks can only go where there is a dash.
 *
 * Ex. "-H-H-H" -> solution: 2 tanks needed, one option is '-HTHTH', or 'TH-HTH'
 */
public class WaterTanks {
    public static void main(String[] args) {
        char[] arrayOfHouses = {'H', '-', 'H', '-', 'H'};


        for(int i=0; i< arrayOfHouses.length -1; i++) {
            if (arrayOfHouses[i] == '-') {
                    //House left and Right
                    if (allow(i,arrayOfHouses.length ) &&
                            arrayOfHouses[i+1] == 'H' && arrayOfHouses[i-1] == 'H') {
                        arrayOfHouses[i] = 'T';
                        i++;
                    }
                }

            }

        for (char x: arrayOfHouses) {
            System.out.println(x);
        }


        }

    private static boolean allow(int i, int max) {
        if (i > 0 && i < max) {
            return true;
        } else {
            return false;
        }

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
