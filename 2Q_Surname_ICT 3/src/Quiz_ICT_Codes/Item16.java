/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming
 * Class:       Item16.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 9, 2026
 * Description: 
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */


package Quiz_ICT_Codes;


import java.io.PrintStream;

public class Item16 {
    public static void main(String[] args) {
        // Ipinapakita na ang System.out ay object nga ng PrintStream
        boolean isPrintStream = System.out instanceof PrintStream;
        System.out.println("Is System.out a PrintStream? " + isPrintStream);
    }
}
