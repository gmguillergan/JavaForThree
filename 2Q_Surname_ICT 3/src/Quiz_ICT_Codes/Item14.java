/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming
 * Class:       Item14.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 9, 2026
 * Description: 
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */


package Quiz_ICT_Codes;


public class Item14 {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: 
                System.out.print("Gold");
            case 2: 
                System.out.print("Silver "); // Mag-match dito; walang break kaya tutuloy pababa!
            case 3: 
                System.out.print("Bronze "); // Na-execute dahil sa fall-through
                break;                      // Dito lang huminto!
            default: 
                System.out.print("None");
        }
    }
}