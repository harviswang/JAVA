
import java.util.Objects;

public class Equivalence {
    static void printBoolean(String s, boolean b) {
        System.out.println(s + " : " + b);
    }
    public static void main(String[] args) {
        Integer n1 = 47;
        Integer n2 = 47;
        printBoolean("n1 == n2", Objects.equals(n1, n2));
        printBoolean("n1 != n2", !Objects.equals(n1, n2));
        printBoolean("n1 > n2", n1 > n2);
        printBoolean("n1 >= n2", n1 >= n2);
        printBoolean("n1 < n2", n1 < n2);
        printBoolean("n1 <= n2", n1 <= n2);
        
        printBoolean("n1.equals(n2)", n1.equals(n2));
        printBoolean("n2.equals(n1)", n2.equals(n1));
    }
}