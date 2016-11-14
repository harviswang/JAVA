import java.util.Random;

public class IgnoreTest {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();
        int d = rand.nextInt();
        int z = rand.nextInt();
        boolean eq = toSuspend(x, d, z) == toResume(x, d, z);
        System.out.println(eq);
    }
    
    static int toSuspend(int x, int d, int z) {
        return (x & d) | (z & (~d));        
    }
    
    static int toResume(int x, int d, int z) {
        return (x | z);
    }
}