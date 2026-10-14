/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming
 * Class:       Item08.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 9, 2026
 * Description: 
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */


package Quiz_ICT_Codes;


public class Item08 {
    public static void main(String[] args) {
        int level = 99;
        switch (level) {
            case 1:
                System.out.println("Beginner");
                break;
            default: // Sinasalo kapag walang nag-match sa cases sa itaas
                System.out.println("Default fallback: Unknown Level");
                break;
        }
    }
}
