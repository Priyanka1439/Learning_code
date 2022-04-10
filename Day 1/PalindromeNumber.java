/* This is generally asked as follow-up or alternative of the previous program. 
This time you need to check if given Integer is palindrome or not. 
An integer is called palindrome if it's equal to its reverse, 
e.g. 1001 is a palindrome, but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234. 
You can use divide by 10 to reduce the number and modulus 10 to get the last digit. This trick is used to solve this problem.
*/

import java.util.*;

public class PalindromeNumber {
    public static boolean pal_num(int num) {
        int palindrome = num;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (num == reverse) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int number = input.nextInt();
        System.out.println("Is the Integer a palindrome?  " + pal_num(number));
        input.close();
    }
}
