public class Literals {
    char c = 0xffff; // max char hex value
    byte b = 0x7f; // max byte hex value
    short s = 0x7fff; // max short hex value
    int i1 = 0x2f; // Hexadecimal (lowercase)
    int i2 = 0X2F; // Hexademical (uppercase)
    int i3 = 0177; // Octal (leading zero)
    
    // Hex and Oct also work with long.
    long n1 = 200L; // long suffix (uppercase)
    long n2 = 200l; // long suffix (lowercase)
    long n3 = 200; // no suffix
    //! long n4(200); // not allowed
    
    float f1 = 1; // no suffix
    float f2 = 1F; // FLOAT suffit
    float f3 = 1f; // float suffix
    float f4 = 1e-45f; // 10 to the power
    float f5 = 1e+9f; // float suffix
    
    double d1 = 1d; // double suffix
    double d2 = 1D; // DOUBLE suffix
    double d3 = 47e47d; // 10 to the power
    
    public static void main(String[] args) {
        Literals literal = new Literals();
        System.out.println("c = " + literal.c);
        System.out.println("b = " + literal.b);
        System.out.println("s = " + literal.s);
        System.out.println("i1 = " + literal.i1);
        System.out.println("i2 = " + literal.i2);
        System.out.println("i3 = " + literal.i3);
        System.out.println("n1 = " + literal.n1);
        System.out.println("n2 = " + literal.n2);
        System.out.println("n3 = " + literal.n3);
        System.out.println("f1 = " + literal.f1);
        System.out.println("f2 = " + literal.f2);
        System.out.println("f3 = " + literal.f3);
        System.out.println("f4 = " + literal.f4);
        System.out.println("f5 = " + literal.f5);
        System.out.println("d1 = " + literal.d1);
        System.out.println("d2 = " + literal.d2);
        System.out.println("d3 = " + literal.d3);
    }
}