/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming
 * Class:       Item13.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 9, 2026
 * Description: 
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */


package Quiz_ICT_Codes;


public class Item13 {
    public static void main(String[] args) {
        int grade = 95;
        if (grade < 83) { // 95 < 83 ay False -> pupunta sa outer else
            System.out.print("C");
        } else {
            if (grade < 92) { // 95 < 92 ay False -> pupunta sa inner else
                System.out.print("B");
            } else {
                System.out.print("A"); // Ito ang mag-i-print!
            }
        }
    }
}