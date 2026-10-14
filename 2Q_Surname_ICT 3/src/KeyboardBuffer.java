/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming
 * Class:       KeyboardBuffer.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 8, 2026
 * Description: Keyboard buffer demo yes.
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */

import java.util.Scanner;

public class KeyboardBuffer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("What is your age: ");
        int age = in.nextInt(); // adds "\n" after you press enter.
        
        System.out.print("What is your level: ");
        int level = in.nextInt(); // \n is ignored so continue lang.
        
        in.nextLine(); // this clears the \n on the buffer. try removing this part
        
        System.out.print("What is your name: ");
        String name = in.nextLine();
        
        
        
        System.out.print("you are " + age + "and "+  level + "and your name is " + name);
    }
}
