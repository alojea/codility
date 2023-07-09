package codility;

public class LongestPassword {
    /**
     *
     * Return the longest password which match with these conditions:
     *
     * it has to contain only alphanumerical characters (a−z, A−Z, 0−9);
     * there should be an even number of letters;
     * there should be an odd number of digits.
     *
     * Input example "test 5 a0A pass007 ?xy1"
     * Output 6 which is pass007
     */

    public static void main(String[] args) {
        System.out.println(solution("test 5 a0A pass007 ?xy1"));
    }

    public static int solution(String str) {
        int maxLenght = -1;
        String[] splited = str.split(" ");
        for(String word:splited) {
            if(validWord(word)) {
                if(maxLenght < word.length()) {
                    maxLenght = word.length();
                }
            }
        }
        return maxLenght;

    }

    private static boolean validWord(String validate) {
        boolean isValid = false;
        int quantityOfNumbers = 0;
        int quantityOfLetters = 0;
        String regex = "^[a-zA-Z0-9]+$";
        String regexNumbers = "[0-9]";
        if(validate.matches(regex)) {
            for (int i = 0; i<validate.length(); i++){
                    if (String.valueOf(validate.charAt(i)).matches(regexNumbers)) {
                        quantityOfNumbers ++;
                    } else {
                        quantityOfLetters ++;
                    }
            }
            if(quantityOfLetters % 2 == 0 && quantityOfNumbers % 2 != 0) {
                return true;
            }
        }
        return false;
    }

}

