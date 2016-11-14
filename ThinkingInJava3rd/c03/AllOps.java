// Tests all the operators on all the primitive data types
// to show which ones are accept by the Java compiler.

import java.lang.ArithmeticException;
import java.util.Random;

public class AllOps {
    /**
     * get the method name of who invoked printCurrentMethodName
     */
    static String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
   
    // To accept the results of a boolean test:
    void f(boolean b) {
        
        System.out.println(getCurrentMethodName() + "(" + b + ")");
    }

    void boolTest(boolean x, boolean y) {
        // Arithmetic operators:
        //! x = x * y;
        //! x = x / y;
        //! x = x + y; // binary operator '+'
        //! x = x - y;
        //! x++;
        //! x--;
        //! x = +y; // unary operator '+'
        //! x = -y;
        // Relational and logical:
        //! f( x > y);
        //! f(x >= y);
        //! f(x < y);
        //! f(x <= y);
        f(x == y);
        f(x != y);
        f(!y);
        x = x && y;
        x = x || y;
        // Bitwise operators:
        //! x = ~y;
        x = x & y;
        x = x | y;
        x = x ^ y;
        //! x = x << 1;
        //! x = x >> 1;
        //! x = x >>> 1;
        // Compound assignment
        //! x += y;
        //! x -= y;
        //! x *= y;
        //! x /= y;
        //! x %= y;
        //! x <<= 1;
        //! x >>= 1;
        //! x >>>= 1;
        x &= y;
        x |= y;
        x ^= y; // x ^ = y; is wrong, since there is a blank between ^ and =
        // Casting:
        boolean B = (boolean)x;
        //! char c = (char)x;
        //! byte b = (byte)x;
        //! short s = (short)x;
        //! int i = (int)x;
        //! long l = (long)x;
        //! float f = (float)x;
        //! double d = (double)x;
    }
    
    void charTest(char x, char y) {
        System.out.println("x: " + (int)x + " y: " + (int)y);
        // Arithmetic operators:
        x = (char)(x * y);
        try {
        x = (char)(x / y);
        } catch (ArithmeticException e) {
            // What should to do
            e.printStackTrace();
        }
        x = (char)(x % y);
        x = (char)(x + y);
        x = (char)(x - y);
        x++; // x = x + 1; not works
        x--;
        x = (char)+y;
        x = (char)-y;
        // Relational and logical:
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //! f(!x);
        //! f(x && y);
        //! f(x || y);
        // Bitwise operatiors:
        x = (char)~y;
        x = (char)(x & y); // possible loss of precision
        x = (char)(x | y);
        x |= y; // this works
        x = (char)(x ^ y);
        x = (char)(x << 1);
        x = (char)(x >> 1);
        x = (char)(x >>> 1);
        // Compound assignment:
        x += y;
        x = (char)(x + y);
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        // Casting:
        //boolean B = (boolean)x;
        byte b = (byte)x;
        short s = (short)x;
        int i = (int)x;
        long l = (long)x;
        float f = (float)x;
        double d = (double)x;
    }
    
    void byteTest(byte x, byte y) {
        // Arithmetic operators:
        x = (byte)(x + y);
        x = (byte)(x - y);
        x = (byte)(x * y);
        try {
            x = (byte)(x / y);
            x = (byte)(x % y);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        x = (byte)(x + y);
        x = (byte)(x - y);
        x++;
        x--;
        x = (byte)+y;
        x = (byte)-y;
        // Relational and logical:
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //! f(!x);
        //! f(x && y);
        //! f(x || y);
        // Bitwise operators:
        x = (byte)~y;
        x = (byte)(x & y);
        x = (byte)(x | y);
        x = (byte)(x ^ y);
        x = (byte)(x << 1);
        x = (byte)(x >> 1);
        x = (byte)(x >>> 1);
        // Compound asignment:
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;
        // Casting:
        //! boolean b = (boolean)x;
        char c = (char)x;
        short s = (short)x;
        int i = (int)x;
        long l = (long)x;
        float f = (float)x;
        double d = (double)x;
    }
    
    void shortTest(short x, short y) {
        // Arithmetic operators:
        x = (short)(x + y);
        x = (short)(x - y);
        x = (short)(x * y);
        try {
            x = (short)(x / y);
            x = (short)(x % y);
        } catch (ArithmeticException e) {
            System.out.println("x: " + x + " y:" + y);
            e.printStackTrace();
        }
        x++;
        x--;
        x = (short)+y;
        x = (short)-y;
        // Relational and logical:
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //! f(!x);
        //! f(x && y);
        //! f(x || y);
        // Bitwise oprators:
        x = (short)~y;
        x = (short)(x & y);
        x = (short)(x | y);
        x = (short)(x ^ y);
        x = (short)(x << 1);
        x = (short)(x >> 1);
        x = (short)(x >>> 1);
        
        // Compound assignment:
        x += y;
        x -= y;
        x *= y;
        try {
            x /= y;
            x %= y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;
        // Casting:
        //! boolean b = (boolean)x;
        char c = (char)x;
        byte B = (byte)x;
        int i = (int)x;
        long l = (long)x;
        float f = (float)x;
        double d = (double)x;
    }
    
    void intTest(int x, int y) {
        // Arithmetic operators:
        x = x + y;
        x = x - y;
        x = x * y;
        try {
            x = x / y;
            x = x % y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        x++;
        x--;
        x = +y;
        x = -y;
        // Relational and logical:
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //! f(!x);
        //! f(x && y);
        //! f(x || y);
        // Bitwise operator:
        x = ~y;
        x = x & y;
        x = x | y;
        x = x ^ y;
        x = x << 1;
        x = x >> 1;
        x = x >>> 1;
        // Compound assignment:
        x += y;
        x -= y;
        x *= y;
        try {
            x /= y;
            x %= y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;
        // Casting:
        //! boolean b = (boolean)x;
        byte B = (byte)x;
        char c = (char)x;
        short s = (short)x;
        long l = (long)x;
        float f = (float)x;
        double d = (double)x;
    }
    
    void longTest(long x, long y) {
        // Arithmetic operators:
        x = x + y;
        x = x - y;
        x = x * y;
        try {
            x = x / y;
            x = x % y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        x++;
        x--;
        x = +y;
        x = -y;
        // Relational and logical:
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //! f(!x);
        //! f(x && y);
        //! f(x || y);
        // Bitwise operator:
        x = ~y;
        x = x & y;
        x = x | y;
        x = x ^ y;
        x = x << 1;
        x = x >> 1;
        x = x >>> 1;
        // Compound assignment:
        x += y;
        x -= y;
        x *= y;
        try {
            x /= y;
            x %= y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;
        // Casting:
        //! boolean b = (boolean)x;
        byte B = (byte)x;
        char c = (char)x;
        short s = (short)x;
        int i = (int)x;
        float f = (float)x;
        double d = (double)x;
    }

    void floatTest(float x, float y) {
        // Arithmetic operators:
        x = x + y;
        x = x - y;
        x = x * y;
        try {
            x = x / y;
            x = x % y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        x++;
        x--;
        x = +y;
        x = -y;
        // Relational and logical:
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //! f(!x);
        //! f(x && y);
        //! f(x || y);
        // Bitwise operator:
        //! x = ~y;
        //! x = x & y;
        //! x = x | y;
        //! x = x ^ y;
        //! x = x << 1;
        //! x = x >> 1;
        //! x = x >>> 1;
        // Compound assignment:
        x += y;
        x -= y;
        x *= y;
        try {
            x /= y;
            x %= y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        //! x <<= 1;
        //! x >>= 1;
        //! x >>>= 1;
        //! x &= y;
        //! x |= y;
        //! x ^= y;
        // Casting:
        //! boolean b = (boolean)x;
        byte B = (byte)x;
        char c = (char)x;
        short s = (short)x;
        int i = (int)x;
        long l = (long)x;
        double d = (double)x;
    }

    void doubleTest(double x, double y) {
        // Arithmetic operators:
        x = x + y;
        x = x - y;
        x = x * y;
        try {
            x = x / y;
            x = x % y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        x++;
        x--;
        x = +y;
        x = -y;
        // Relational and logical:
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //! f(!x);
        //! f(x && y);
        //! f(x || y);
        // Bitwise operator:
        //! x = ~y;
        //! x = x & y;
        //! x = x | y;
        //! x = x ^ y;
        //! x = x << 1;
        //! x = x >> 1;
        //! x = x >>> 1;
        // Compound assignment:
        x += y;
        x -= y;
        x *= y;
        try {
            x /= y;
            x %= y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        //! x <<= 1;
        //! x >>= 1;
        //! x >>>= 1;
        //! x &= y;
        //! x |= y;
        //! x ^= y;
        // Casting:
        //! boolean b = (boolean)x;
        byte B = (byte)x;
        char c = (char)x;
        short s = (short)x;
        int i = (int)x;
        long l = (long)x;
        float f = (float)x;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        AllOps allOps = new AllOps();
        allOps.boolTest(rand.nextBoolean(), 
                        rand.nextBoolean());
        allOps.charTest((char)rand.nextInt(0xffff), 
                        (char)rand.nextInt(0xffff));
        allOps.byteTest((byte)rand.nextInt(0xff), 
                        (byte)rand.nextInt(0xff));
        allOps.shortTest((short)rand.nextInt(0xffff), 
                         (short)rand.nextInt(0xffff));
        allOps.intTest(rand.nextInt(), 
                       rand.nextInt());
        allOps.longTest(rand.nextLong(), 
                        rand.nextLong());
        allOps.floatTest(rand.nextFloat(), 
                         rand.nextFloat());
        allOps.doubleTest(rand.nextDouble(), 
                          rand.nextDouble());
    }
}