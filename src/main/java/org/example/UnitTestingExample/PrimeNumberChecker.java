package org.example.UnitTestingExample;

public class PrimeNumberChecker {
    public boolean isPrime(int n){
        for (int i = 2; i <= n/2; i++)
            if (n%i == 0){
                return false;
            }
        return true;
    }
}
