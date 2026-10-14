/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming
 * Class:       Item19.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 9, 2026
 * Description: 
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */


package Quiz_ICT_Codes;


public class Item19 {
    public static void main(String[] args) {
        int val = 5;
        // Tamang pairing:
        if (val > 10) {
            System.out.println("Greater");
        } else {
            System.out.println("Laging kailangan ng if bago mag-else!");
        }

        // I-uncomment para ipakita ang error sa klase:
        // else { System.out.println("Mag-isa lang ako!"); } // Compile Error: 'else' without 'if'
    }
}