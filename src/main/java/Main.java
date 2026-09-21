import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        getFirstLetter("");
        System.out.println("This project does only tests");
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String getFirstLetter(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        return string.charAt(0) + "";
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;

        }
    }

    public static boolean isPrime2(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (long i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

}
