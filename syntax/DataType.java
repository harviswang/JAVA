/*
 * java 通过方法名和参数来唯一确定一个方法(或者说message), 与方法返回值类型无关
 */
public class DataType {

    public static void main(String[] args){
        DataType dt = new DataType();
        System.out.println("Testing Java standard data type");
        dt.testIntegerDataType();
        //dt.testBooleanDataType();
        maxIntTest();
        dt.testPrimaryDataType();
    }

    /**
     * boolean
     * char
     * byte
     * short
     * int
     * long
     * float
     * double
     * String
    */
    public void testPrimaryDataType() {
        boolean ok = false;
        System.out.println(boolean.class.getClass().toString());
        System.out.println(char.class.getClass().toString());
        System.out.println(byte.class.getClass().toString());
        System.out.println(short.class.getClass().toString());
        System.out.println(int.class.getClass().toString());
        System.out.println(long.class.getClass().toString());
        System.out.println(float.class.getClass().toString());
        System.out.println(double.class.getClass().toString());
        System.out.println(String.class.getClass().toString());
        System.out.println(Boolean.TYPE);
    }

    public void testIntegerDataType(){
        int a = 12;
        int max = 0x7FFFFFFF;
        int min = 0x80000000;
        int sum = max + min;
        int sub = max - min;
        int multiplation = max + 1;
        int two = -2;
        System.out.println("a = " + a);
        System.out.println("max int is " + max);
        System.out.println("min int is " + min);
        System.out.println("max + min is " + sum);
        System.out.println("max - min is " + sub);
        System.out.println("max * 2 is " + multiplation);
        System.out.println("-2 is " + Integer.toHexString(two));

        short s = (short)0x8079;
        System.out.println("s is " + Integer.toHexString(s));

    }

    public void testBooleanDataType() {
        boolean b = true;
        System.out.println("b is " + b);
        System.out.println("!b is " + !b);
    }

    public void testFloatDataType() {
        float f = 0.1f;
        System.out.println("f is " + f);

    }
    static  {
        System.out.println("is it run before main() method?");
    }

    public static void maxIntTest() {
        System.out.println("max int is " + (int)0x7fffffff);
    }
}
