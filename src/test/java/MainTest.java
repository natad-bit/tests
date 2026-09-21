import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isPositive_expectTrue_whenGiven10() {
        assertTrue(Main.isPositive(10));
    }

    @Test
    void isPositive_expectFalse_whenGivenMinus100() {
        assertFalse(Main.isPositive(-100));
    }

    @Test
    void multiply_expect6_whenGiven2and3() {
        assertEquals(6, Main.multiply(2, 3));
    }

    @Test
    void multiply_expect69_whenGiven23and3() {
        assertEquals(69, Main.multiply(23, 3));
    }

    @Test
    void getFirstLetter_expectLetter_whenGivenString() {
        assertEquals("a", Main.getFirstLetter("agff"));
    }

    @Test
    void getFirstLetter_expectNull_whenGivenNull() {
        assertNull(Main.getFirstLetter(null));
    }

    @Test
    void getFirstLetter_expectNull_whenGivenStringIsEmpty() {
        assertNull(Main.getFirstLetter(""));
    }

    @Test
    void isPrime_expectTrue_whenGiven11() {
        assertTrue(Main.isPrime(11));
    }

    @Test
    void isPrime_expectFalse_whenGiven1() {
        assertFalse(Main.isPrime(1));
    }

    @Test
    void isPrime_expectFalse_whenGiven0() {
        assertFalse(Main.isPrime(0));
    }

    @Test
    void isPrime_expectFalse_whenGiven10() {
        assertFalse(Main.isPrime(10));
    }

    @Test
    void isPrime_expectTrue_whenGivenBigNumber() {
        assertTrue(Main.isPrime(2147483647));
    }

    @Test
    void isPrime2_expectTrue_whenGivenBigNumber() {
        assertTrue(Main.isPrime2(2147483647));
    }

}