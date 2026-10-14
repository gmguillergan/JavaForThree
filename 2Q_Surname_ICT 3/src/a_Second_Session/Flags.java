/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming
 * Class:       Flags.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 8, 2026
 * Description: 
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */


package a_Second_Session;


import java.util.Scanner;

public class Flags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPositive = false;
        boolean isZero = false;
        boolean isNegative = false;

        if (number > 0) {
            isPositive = true;
        } else if (number < 0) {
            isNegative = true;
        } else {
            isZero = true;
        }

        if (isPositive) {
            System.out.println("The number is positive.");
        } else if (isZero) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is negative.");
        }
    }
}