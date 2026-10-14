/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming
 * Class:       NestedLoopDemo.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 9, 2026
 * Description: Nested Loop Demo
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */


package Condition_Loop;

public class NestedLoopDemo {
    public static void main(String[] args) {
        System.out.println("=== NESTED LOOP: Star Pattern Grid ===");
        
        int rows = 4;
        int cols = 5;
        
        // Outer loop: namamahala sa bawat row (pababa)
        for (int r = 1; r <= rows; r++) {
            
            // Inner loop: tumatakbo nang buo bawat isang row (pahalang)
            for (int c = 1; c <= cols; c++) { // will print the 4 rows (rows = 4) based on cols.
                System.out.print("* ");
            }
            
            System.out.println(); // Break line
        }
    }
}