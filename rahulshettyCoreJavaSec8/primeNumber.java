package rahulshettyCoreJavaSec8;

import java.util.Scanner;
/*
Check if number is divisible by 1 or itself is a PRIME number
Logic is to divide by 2 using mod operator, as a remainder should be 0 to be a prime.
If a remainder is NOT 0, then it's not prime.
We are using num/2, it means in loop if given is not found as PRIME till first half of given value
then remaining also would not satisfy.*/

public class primeNumber {
    public static void main(String[] args) {
        int num = 9;
        System.out.println("The given number is: " + num);
        // initial count of factors
        int count = 0;
            // checking number of factors
            // i.e., how many times number is able to divide ..
            // by all natural numbers less than or equal to number.
            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    count++;
                }
            }
            // checking number of counts to print result i.e., count is > 2 it means, there are multiple factors
            if(count == 2) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }
    }

