import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TDDTest {

    @Test
    void sum_expect3_whenGiven1and2() {
        int a = 1;
        int b = 2;
        int result = 3;
        assertEquals(result, TDD.sum(a, b));
    }

    @Test
    void isEven_expectTrue_whenGiven2() {
        int a = 2;
        assertTrue(TDD.isEven(a));
    }

    @Test
    void isEven_expectFalse_whenGiven3() {
        int a = 3;
        assertFalse(TDD.isEven(a));
    }

    @Test
    void getFirstCharacter_expectH_whenGivenHumbold() {
        char a = 'H';
        String string = "Humbold";
        char result = TDD.getFirstCharacter(string);
        assertEquals(a, result);
    }

    @Test
    void getFirstCharacter_expectEmpty_whenGivenEmptyString() {
        String string = "";
        char result = TDD.getFirstCharacter(string);
        assertEquals(' ', result);
    }

    @Test
    void reverseString_expectReverseString_whenGivenString() {
        String string = "Java";
        String expect = "avaJ";
        String result = TDD.reverseString(string);
        assertEquals(expect, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Otto", "mom", "Lol", "rotator", "Fehler"})
    void isPolydrome_expectTrue_whenGivenPolydrome(String string) {
        assertTrue(TDD.isPalidrome(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Java", "Ok", "none"})
    void isPolydrome_expectFalse_whenGivenNotPolydrome(String string) {
        assertFalse(TDD.isPalidrome(string));
    }

    @ParameterizedTest
    @CsvSource({
            "Hallo, 2",
            "Go on, 2",
            "Liebe, 3",
            "tttd, 0"
    })
    void countVowels_expectNumber_whenGivenString(String string, int count) {
        assertEquals(count, TDD.countVowels(string));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1", "3, 6", "5, 120", "0, 1"
    })
    void factorial(int number, int factorial) {
        assertEquals(factorial, TDD.factorial(number));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0", "1, 1", "6, 8"
    })
    void fibonacci(int number, int fibonacci) {
        assertEquals(fibonacci, TDD.fibonacci(number));
    }
}