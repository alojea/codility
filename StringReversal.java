package codility;

/**
 * Revert string without using API and using recursion
 */
public class StringReversal {

    public static void main(String[] args) {
        String example = new String("revertme");
        char[] reverted = revertString(example.toCharArray(), 0, example.length()-1);
        System.out.printf("Reverted string (%s) -> (%s)", example, String.valueOf(reverted));
    }

    public static char[] revertString(char[] stringToRevert, int initialPointer, int endPointer) {

        if(String.valueOf(stringToRevert).equals("emtrever")) {
            return stringToRevert;
        } else {
            char temp = stringToRevert[initialPointer];
            stringToRevert[initialPointer] = stringToRevert[endPointer];
            stringToRevert[endPointer] = temp;
            initialPointer++;
            endPointer--;
            return revertString(stringToRevert, initialPointer, endPointer);
        }
    }
}
