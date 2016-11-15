public class OneTo100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if ((i % 10) == 0) {
                System.out.println();
            }
            
            // if (i == 47) break;
            if (i == 47) return;
        }
    }
}