/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming
 * Class:       LoopControlDemo.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 9, 2026
 * Description: Loop control demo (using break and continue).
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */


package Condition_Loop;

public class LoopControlDemo {
    public static void main(String[] args) {
        System.out.println("=== LOOP CONTROL: break & continue ===");
        
        for (int i = 1; i <= 6; i++) {
            
            // Kapag i == 3, i-skip ang print at dumiretso agad sa i = 4
            if (i == 3) {
                System.out.println("-> Number " + i + " skipped gamit ang continue!");
                continue;
            }
            
            // Kapag i == 5, puputulin na nang tuluyan ang buong loop
            if (i == 5) {
                System.out.println("-> Number " + i + " na, stop na ang loop gamit ang break!");
                break;
            }
            
            System.out.println("Number: " + i);
        }
        
        System.out.println("Tapos na ang loop.");
    }
}
