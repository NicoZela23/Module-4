import org.example.UnitTestingExample.PrimeNumberChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberTest {
    @Test
    public void testPrimeNumber() {
        PrimeNumberChecker primeNumber = new PrimeNumberChecker();
        assertTrue(primeNumber.isPrime(7));
    }
    @Test
    public void testNonPrimeNumber() {
        PrimeNumberChecker primeNumber = new PrimeNumberChecker();
        assertFalse(primeNumber.isPrime(10));
    }
    @Test
    public void testNumberOne() {
        PrimeNumberChecker primeNumber = new PrimeNumberChecker();
        assertFalse(primeNumber.isPrime(1));
    }
    @Test
    public void testLargePrimeNumber() {
        PrimeNumberChecker primeNumber = new PrimeNumberChecker();
        assertTrue(primeNumber.isPrime(7919));
    }
    @Test
    public void testLargeNonPrimeNumber() {
        PrimeNumberChecker primeNumber = new PrimeNumberChecker();
        assertFalse(primeNumber.isPrime(10000));
    }
    @Test
    public void testNegativeNumbers() {
        PrimeNumberChecker primeNumber = new PrimeNumberChecker();
        assertFalse(primeNumber.isPrime(-10));
    }
    @Test
    public void testZero() {
        PrimeNumberChecker primeNumber = new PrimeNumberChecker();
        assertFalse(primeNumber.isPrime(0));
    }
    @Test
    public void testVeryLargePrimeNumber() {
        PrimeNumberChecker primeNumber = new PrimeNumberChecker();
        assertTrue(primeNumber.isPrime(2147483647));
    }
    @Test
    public void testVeryLargeNonPrimeNumber() {
        PrimeNumberChecker primeNumber = new PrimeNumberChecker();
        assertFalse(primeNumber.isPrime(2147483646));
    }

}
