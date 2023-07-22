package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;

/**
 * Form the large number with array of numbers
 * [51,108,8,99,1341,9]
 * output
 * 1341108995198
 */
public class LargestNumber {

    public static void main(String[] args) {
        int[] arrayInt = {51, 108, 8, 99, 1341, 9};
        String result = "1341108995198";
        String convertedStringResult = new String();
        
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = i; j < arrayInt.length; j++) {
                if (arrayInt[i] < arrayInt[j]) {
                    int temp = arrayInt[i];
                    arrayInt[i] = arrayInt[j];
                    arrayInt[j] = temp;

                }
            }
        }
        for (int value:arrayInt) {
            convertedStringResult = convertedStringResult.concat(String.valueOf(value));
        }
        if (convertedStringResult.equals(result)) {
            System.out.printf("Large number result %s",convertedStringResult);
        } else {
            System.out.printf("Large number result %s is not matching",convertedStringResult);
        }

    }
}
