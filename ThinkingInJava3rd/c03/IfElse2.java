public class IfElse2 {
    static int test(int testval, int target) {
        if (testval > target) {
            return +1;
        } else if (testval < target) {
            return -1;
        } else {
            return 0;
        }
    }

    static boolean isBetween(int testval, int begin, int end) {
        return (testval > begin) && (testval < end);
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5));
        System.out.println(test(5, 10));
        System.out.println(test(5, 5));
        System.out.println(isBetween(6, 5, 8));
    }
}