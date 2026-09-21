public class TDD {
    public static void main(String[] args) {

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static char getFirstCharacter(String string) {
        if (string.isEmpty())
            return ' ';
        return string.charAt(0);
    }

    public static String reverseString(String string) {
        String result = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            result += string.charAt(i);
        }
        return result;
    }

    public static boolean isPalidrome(String string) {
        String upperCaseString = string.toUpperCase();
        int j = string.length() - 1;
        for (int i = 0; i < string.length() / 2; i++, j--) {
            if (upperCaseString.charAt(i) != upperCaseString.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static int countVowels(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e'
                    || string.charAt(i) == 'i' || string.charAt(i) == 'o') {
                count++;
            }
        }
        return count;
    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static int fibonacci(int number) {
        int[] fibonacciNumbers = new int[number + 1];
        if (number > 1) {
            fibonacciNumbers[0] = 0;
            fibonacciNumbers[1] = 1;
            for (int i = 2; i <= number; i++) {
                fibonacciNumbers[i] = fibonacciNumbers[i - 2] + fibonacciNumbers[i - 1];
            }
            return fibonacciNumbers[number];
        } else {
            return number;
        }
    }
}
