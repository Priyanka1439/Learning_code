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
