/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming
 * Class:       DoWhileLoopDemo.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 9, 2026
 * Description: Do while loop demo test
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */

package Condition_Loop;

import java.util.Scanner;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice;
        
        System.out.println("=== DO-WHILE LOOP: Game Menu ===");
        
        do {
            System.out.println("\n[1] Start Game");
            System.out.println("[2] Settings");
            System.out.println("[3] Exit Game");
            System.out.print("Piliin ang action (1-3): ");
            choice = keyboard.nextInt();
            
            if (choice == 1) {
                System.out.println("Naglo-load ang laro...");
            } else if (choice == 2) {
                System.out.println("Opening ze settings...");
            }
            
        // Uulitin hangga't hindi pinipili ang 3 (exit)
        
        } while (choice != 3); // while argument is place at last so, loop with run AT LEAST ONCE
        
        System.out.println("Thank is you for playing!");
    }
}