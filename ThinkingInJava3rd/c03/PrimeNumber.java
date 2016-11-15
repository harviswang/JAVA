public class PrimeNumber {
    static boolean isPrimeNumber(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    static void switchTest(int n) {
        for (int i = 0; i < n; i++) {
            switch(i % 3) {
                case 0:
                    System.out.println("zero");
                    //break;
                case 1:
                    System.out.println("one");
                    //break;
                case 2:
                    System.out.println("tow");
                    //break;
                default:
                    System.out.println("nothing");
                    //break;
            }   
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(121));
        switchTest(10);
    }
}