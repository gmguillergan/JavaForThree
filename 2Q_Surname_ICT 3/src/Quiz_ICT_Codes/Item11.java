/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming
 * Class:       Item11.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 9, 2026
 * Description: 
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */


package Quiz_ICT_Codes;


public class Item11 {
    public static void main(String[] args) {
        int score = 75;
        // Ang 75 > 75 ay FALSE (kailangan sana ay >= 75 para maging true)
        if (score > 75) {
            System.out.print("Pass");
        } else {
            System.out.print("Retake"); // Dito pupunta ang execution!
        }
    }
}
