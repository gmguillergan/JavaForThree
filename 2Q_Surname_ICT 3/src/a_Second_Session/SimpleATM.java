/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming 1
 * Class:       SimpleATM.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 9, 2026
 * Description: Simple ATM System with PIN Authentication
 *              and Transaction Looping
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */

// NOTE: Students should store SimpleATM.java on a project using the format: SimpleATM_Surname

package a_Second_Session; // This is not included in SimpleATM_Surname

import java.util.Scanner;

public class SimpleATM {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int CORRECT_PIN = 1234;
        int attempts = 0;
        int MAX_ATTEMPTS = 3;
        boolean isAuthenticated = false;
        double balance = 5000.00;
        
        System.out.println("=================================");
        System.out.println("      WELCOME TO PERPETUAL BANK  ");
        System.out.println("=================================");
        
        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your 4-digit PIN: ");
            int enteredPin = keyboard.nextInt();
            
            if (enteredPin == CORRECT_PIN) {
                isAuthenticated = true;
                System.out.println("\n>> Login Successful! Welcome to your account.");
                break;
            } else {
                attempts++;
                int remaining = MAX_ATTEMPTS - attempts;
                
                if (remaining > 0) {
                    System.out.println(">> Incorrect PIN. Remaining attempts: " + remaining + "\n");
                } else {
                    System.out.println("\n>> [ALERT] You have reached the maximum attempts (3).");
                    System.out.println(">> Your account is now LOCKED for security purposes.");
                }
            }
        }
        
        if (isAuthenticated) {
            int choice;
            
            do {
                System.out.println("\n---------------------------------");
                System.out.println("        TRANSACTION MENU         ");
                System.out.println("---------------------------------");
                System.out.println("[1] Check Balance");
                System.out.println("[2] Deposit Money");
                System.out.println("[3] Withdraw Money");
                System.out.println("[4] Exit / Return Card");
                System.out.println("---------------------------------");
                
                System.out.print("Enter your transaction (1-4): ");
                choice = keyboard.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.println("\n--- BALANCE INQUIRY ---");
                        System.out.printf("Current Balance: PHP %.2f%n", balance);
                        break;
                        
                    case 2:
                        System.out.println("\n--- DEPOSIT ---");
                        System.out.print("Enter amount to deposit: PHP ");
                        double depositAmount = keyboard.nextDouble();
                        
                        if (depositAmount > 0) {
                            balance += depositAmount;
                            System.out.printf(">> Deposit successful! New Balance: PHP %.2f%n", balance);
                        } else {
                            System.out.println(">> Invalid deposit amount!");
                        }
                        break;
                        
                    case 3:
                        System.out.println("\n--- WITHDRAWAL ---");
                        System.out.print("Enter amount to withdraw: PHP ");
                        double withdrawAmount = keyboard.nextDouble();
                        
                        if (withdrawAmount > balance) {
                            System.out.println(">> Transaction Failed: Insufficient funds!");
                        } else if (withdrawAmount <= 0) {
                            System.out.println(">> Transaction Failed: Invalid withdrawal amount!");
                        } else {
                            balance -= withdrawAmount;
                            System.out.printf(">> Withdrawal successful! Remaining Balance: PHP %.2f%n", balance);
                        }
                        break;
                        
                    case 4:
                        System.out.println("\nThank you for banking with Perpetual Bank!");
                        System.out.println("Please take your card. Have a nice day!");
                        break;
                        
                    default:
                        System.out.println("\n>> Invalid transaction choice! Please select 1 to 4 only.");
                        break;
                }
                
            } while (choice != 4);
        }
        
    }
}