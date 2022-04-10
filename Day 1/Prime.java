/* Write a Java program to check if a given number is prime or not. Remember, 
a prime number is a number which is not divisible by any other number, e.g. 3, 5, 7, 11, 13, 17, etc. 
Be prepared for cross, e.g. checking till the square root of a number, etc.

Read more: https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html#ixzz7Q5EsfS9y */

import java.util.*;

public class Prime {
    public static boolean isPrime(int val) {
        boolean flag = true;
        // First Method

        /*
         * for (int i = 2; i < val; i++) {
         * if (val % i == 0) {
         * flag = false;
         * }
         * }
         */

        // Second Method
        if (val == 2) {
            return flag;
        }
        if (val % 2 == 0) {
            flag = false;
        }
        for (int i = 3; i < val; i += 2) {
            if (val % i == 0) {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = input.nextInt();
        System.out.println(isPrime(n));
        input.close();
    }
}
