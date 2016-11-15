public class TernaryOperator {
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }

    static int alternative(int i) {
        if (i < 10) {
            return i * 100;
        } else {
            return i * 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(ternary(11));
        System.out.println(ternary(9));
        System.out.println(alternative(10 + 1));
        System.out.println(alternative(10 - 1));
    }
}