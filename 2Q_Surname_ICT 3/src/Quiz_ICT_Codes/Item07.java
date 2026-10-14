/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming
 * Class:       Item07.java
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

public class Item07 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Mag-type ng number at pindutin ang Enter: ");
        int num = keyboard.nextInt(); // Iniwan ang '\n' sa buffer

        System.out.print("Mag-type ng pangalan: ");
        String name = keyboard.nextLine(); // Agad na kukunin ang natirang '\n' kaya ma-i-skip!

        System.out.println("Pangalan na nabasa: [" + name + "] (Nalaktawan dahil empty string!)");
    }
}
