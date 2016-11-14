public class WhileTest {
    public static void main(String[] args) {
        double r = 0;
        while (r < 0.99d) {
            System.out.println(r);
            r = Math.random();
        }
    }
}