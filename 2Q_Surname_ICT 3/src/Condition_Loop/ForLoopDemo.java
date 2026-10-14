/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming
 * Class:       ForLoopDemo.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 9, 2026
 * Description: Demonstration of for loop demo.
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */


package Condition_Loop;

public class ForLoopDemo {
    public static void main(String[] args) {
        System.out.println("=== FOR LOOP: Rocket Countdown ===");
        
        // 1. start (i = 5) | 2. stop (i >= 1) | 3. bawas 1 bawat ikot (i--)
        for (int i = 5; i >= 1; i--) {
            System.out.println("T-minus " + i + " seconds...");
        }
        
        System.out.println("Blast off! 🚀");
    }
}
