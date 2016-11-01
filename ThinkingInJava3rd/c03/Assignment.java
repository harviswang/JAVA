class Number {
    int i;
}

public class Assignment {
    public static void main(String[] args) {
        /* Whenever you manipulate an object, what you’re manipulating is the reference */
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 9;
        n2.i = 47;
        System.out.println("1: n1.i: " + n1.i + ", n2.i: " + n2.i);
        n1 = n2; /* here both n1 and n2 refer to the same object */
        System.out.println("2: n1.i: " + n1.i + ", n2.i: " + n2.i);
        n1.i = 27; /* so, n2.i is 27 now */
        System.out.println("3: n1.i: " + n1.i + ", n2.i: " + n2.i);
        
        /*  the primitive holds the actual value and not a reference to an object, */
        int n3 = 2016;
        int n4 = 1988;
        System.out.println("1: n3: " + n3 + ", n4: " + n4);
        n3 = n4;
        System.out.println("2: n3: " + n3 + ", n4: " + n4);
        n3 = 1899;
        System.out.println("3: n3: " + n3 + ", n4: " + n4);
    }
}