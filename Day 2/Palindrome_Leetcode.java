/*
125. Valid Palindrome
https://leetcode.com/problems/valid-palindrome/
*/

public class Palindrome_Leetcode {
    public static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {
                str.append(Character.toLowerCase(ch));
            }
        }
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
