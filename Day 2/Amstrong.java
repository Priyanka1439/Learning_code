
/* A number is called an Armstrong number if it is equal to the cube of its every digit.
For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3.
You need to write a program to check if the given number is Armstrong number or not.
 */
import java.util.*;

public class Amstrong {
    public static int numberOfDigits(int val) {
        int count = 0;
        while (val > 0) {
            count++;
            val = val / 10;
        }
        return count;
    }

    public static boolean isAmstrong(int num) {
        int n = numberOfDigits(num);
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int r = temp % 10;
            sum = (int) (sum + Math.pow(r, n));
            temp = temp / 10;
        }
        return (sum == num);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int number = input.nextInt();
        if (isAmstrong(number)) {
            System.out.println("It is an Amstrong number.");
        } else {
            System.out.println("It is not a Amstrong number.");
        }
        input.close();
    }
}
