/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming
 * Class:       Item09.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 9, 2026
 * Description: 
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */


package Quiz_ICT_Codes;


import java.util.Scanner;

public class Item09 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Simulating input stream
        double rate = keyboard.nextDouble();     // Nagbabasa ng double-precision float
        System.out.println("Nabasa gamit ang nextDouble(): " + rate);
        keyboard.close();
    }
}
