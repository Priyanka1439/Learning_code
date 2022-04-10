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
