/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming
 * Class:       WhileLoopDemo.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 9, 2026
 * Description: 
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */


package Condition_Loop;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("=== WHILE LOOP: Secret Passcode ===");
        System.out.print("Enter password: ");
        int password = keyboard.nextInt();
        
        // Chine-check muna ang condition bago pumasok sa body
        while (password != 1234) {
            System.out.println("Access Denied! Mali ang password.");
            System.out.print("Subukan ulit: ");
            password = keyboard.nextInt(); // Ina-update ang value para hindi mag-infinite loop
        }
        
        System.out.println("Access Granted! Welcome!");
    }
}