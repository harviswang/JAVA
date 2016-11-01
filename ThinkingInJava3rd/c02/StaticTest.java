public class StaticTest {
    static int i = 47;
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        StaticTest.i = 2016;
        StaticFun sf = new StaticFun();
        StaticFun.incr();
        System.out.println("st1.i = " + StaticTest.i);
        System.out.println("st2.i = " + StaticTest.i);
    }
}

class StaticFun {
    static void incr() {
        StaticTest.i++;
    }
}