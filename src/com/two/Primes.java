package com.two;

public class Primes {
    public static void main(String[] args) {
        int i, j, count = 0;
        System.out.println("prime numbers between 1 to 100");
        for (i = 2; i <= 100; i++) {
            for (j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2)
                System.out.println(" " + i);
            else {
                System.out.println("factors for " + i + " are " + count);

            }
            count = 0;
        }
    }
}
