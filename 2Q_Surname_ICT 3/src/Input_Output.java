import java.util.Scanner;

/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming
 * Class:       Input_Output.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 8, 2026
 * Description: Demonstration of Scanner (input) and PrintStream (output)
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */

public class Input_Output {
    public static void main(String[] args) {
      
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String myName = keyboard.nextLine();
        
        System.out.print("What is your age?: ");
        int myAge = keyboard.nextInt();
        
        System.out.print("What is your grade level?: ");
        int myLevel = keyboard.nextInt();
        
        System.out.print("What is your gender?: ");
        char myGender = keyboard.next().charAt(0);
        
        System.out.println("My name is " + myName + ". \n"
                            + "My age is " + myAge + ". \n"
                            + "My grade level is " + myLevel + ". \n"
                            + "My gender is " + myGender + ".");
        
    }
    
}
