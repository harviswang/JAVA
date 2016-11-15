/**
 * 
 * @author Harvis
 */

public class Precedence {
    public static void main(String[] args) {
        int 
                x = 8,
                y = 9,
                z = 4,
                a = x + y - 2/2 + z;
        System.out.println("x + y - 2/2 + z = " + a);
        a = x + (y - 2)/(2 + z);
        System.out.println("x + (y - 2)/(2 + z) = " +a);
    }
}