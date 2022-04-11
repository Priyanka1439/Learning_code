/*
Write a Java program to find if a year is a leap year or not
*/

import java.util.*;

public class LeapYear {
    public static boolean leap(int year) {
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year:  ");
        int year = input.nextInt();
        if (leap(year)) {
            System.out.println("It is a Leap Year.");
        } else {
            System.out.println("It is not a Leap Year.");
        }
        input.close();
    }
}
