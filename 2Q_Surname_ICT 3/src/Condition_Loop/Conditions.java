/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming 1
 * Class:       Conditions.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 8, 2026
 * Description: Simple Menu Selection using switch-case
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */

package Condition_Loop;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your name: ");
        String userName = keyboard.nextLine();
        
        if (userName.trim().length() > 2) {

            System.out.println("\n***** PROFILE PAGE *****");
            System.out.println("Welcome, " + userName + "!");
            System.out.println("[1] View Profile");
            System.out.println("[2] Edit Profile");
            System.out.println("[3] Logout");
            
            System.out.print("Please enter your selection (1, 2, 3): ");
            int selection = keyboard.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("\nResult: Viewing profile details...");
                    break;
                    
                case 2:
                    System.out.println("\nResult: Edit profile settings opened.");
                    break;
                    
                case 3:
                    System.out.println("\nResult: Goodbye, " + userName + "! Logging out...");
                    break;
                    
                default:

                    System.out.println("\nError: Invalid selection! Please choose 1, 2, or 3 only.");
                    break;
            }
            
        } else {
            System.out.println("Error: Name must be more than 2 characters.");
        }
    }
}