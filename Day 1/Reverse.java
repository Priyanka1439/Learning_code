/* You need to write a simple Java program to check if a given String is palindrome or not.
A Palindrome is a String which is equal to the reverse of itself, e.g.,
"Bob" is a palindrome because of the reverse of "Bob" is also "Bob." 
Though be prepared with both recursive and iterative solution of this problem.
The interviewer may ask you to solve without using any library method, e.g. indexOf() or subString() so be prepared for that.
 */

import java.util.*;

public class Reverse {
    public static boolean reverse(String val) {
        StringBuilder sb = new StringBuilder(val);
        sb.reverse();
        String val_rev = sb.toString();
        if (val.equals(val_rev)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String:  ");
        String val = input.next();
        System.out.println("Is the String a palindrome?  " + reverse(val));
        input.close();
    }
}
