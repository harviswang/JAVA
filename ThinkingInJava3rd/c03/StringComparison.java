public class StringComparison {
    static void stringCompare(String l, String r) {
        // Relational oprator
        System.out.println(l == r);
        System.out.println(l != r);
        System.out.println(l.equals(r));
        System.out.println(r.equals(r));
        System.out.println(!r.equals(l));
        //! System.out.println(l > r);
        //! System.out.println(l >= r);
        //! System.out.println(l < r);
        //! System.out.println(l <= r);
        // Logical oprator
        //! System.out.println(!l);
        //! System.out.println(l && r);
        //! System.out.println(l || r);
        // Bitwise operator
        //! System.out.println(l & r);
        //! System.out.println(l | r);
        //! System.out.println(l ^ r);
    }

    public static void main(String[] args) {
        String l = "left";
        String r = "right";
        stringCompare(l, r);
    }
}