/* 
This problem is similar to the String Palindrome problem we have discussed above. 
If you can solve that problem, you can solve this as well.
You can use indexOf() or substring() to reverse a String or alternatively,
convert the problem to reverse an array by operating on character array instead of String.
*/

import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String:  ");
        String value = input.next();
        StringBuilder reverse = new StringBuilder();
        for (int i = value.length() - 1; i >= 0; i--) {
            reverse = reverse.append(value.charAt(i));
        }
        System.out.println("The Reversed string is :" + reverse);
        input.close();
    }
}
