
/* 
This is one of the simplest programs you can expect in interviews.
It is generally asked to see if you can code or not.
Sometimes interviewer may also ask about changing a recursive solution to iterative one or vice-versa.
*/
import java.util.*;

public class Factorial {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fact(int num) {
        if (num <= 2) {
            return num;
        }
        if (memo.containsKey(num)) {
            return memo.get(num);
        }
        int res = num * fact(num - 1);
        memo.put(num, res);
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(fact(number));
        input.close();
    }
}
