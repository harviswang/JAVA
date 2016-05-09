public class Loop {
    public static void main(String[] args) {
        //testWhile();
        testFor();
    }

    public static void testWhile() {
        int i = 0;
        while (i++ < 10) {
            if (i == 8)
                break;
            System.out.println(i);
        }
    }

    public static void testFor() {
        double step = 0.0125;
        double sum = 0.0;
        for (int i = 0; i <= 0xE8 ; i++ ) {
            sum += step;
            System.out.println(i + " " + (float)sum);
        }
    }
}
