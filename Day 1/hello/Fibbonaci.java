/* 
Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number.
We prepare for cross questions like using iteration over recursion and how to optimize the solution using caching and memoization.
*/

// This is done using Memonization method

import java.util.*;

class Fibbonaci {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fib(int val) {
        if (val == 0 || val == 1) { // Checking if n = 0 or 1
            return val;
        }
        if (memo.containsKey(val)) { // Checking if n already exist in memo
            return memo.get(val);
        }
        int res = fib(val - 1) + fib(val - 2); // else calculating fib
        memo.put(val, res); // Putting the calculated value to memo

        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
        input.close();
    }
}
