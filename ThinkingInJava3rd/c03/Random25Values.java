import java.util.Random;

public class Random25Values {
    public static void main(String[] args) {
        while (true) {
            Random rand = new Random();
            int current = rand.nextInt();
            for (int i = 0; i < 25 - 1; i++) {
                int next = rand.nextInt();
                if (current > next) {
                    System.out.println(i + " random is greater then " + (i+1) +" random");
                } else {
                    System.out.println(i + " random is less then or equal to " + (i+1) +" random");
                }
                current = next;
            }
        }
    }
}