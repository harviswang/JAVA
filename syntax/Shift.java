public class Shift {
    public static void main(String[] args) {
        ShiftTest();
    }

    private static long ShiftTest() {
        long size = 2642198528L;
        long res = size >> 30;
        System.out.println("2642198528 >> 30 = " + res);
        res = (4L << ((res + 4 - 1)/4)) << 30;
        System.out.println("2642198528 >> 30 << 30 = " + res);
        return res;
    }
}
