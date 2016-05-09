public class DataType {

    public static void main(String[] args){
        DataType dt = new DataType();
        System.out.println("Testing Java standard data type");
        //dt.testIntegerDataType();
        //dt.testBooleanDataType();
    }

    public void testIntegerDataType(){
        int a = 12;
        int max = 0x7FFFFFFF;
        int min = 0x80000000;
        int sum = max + min;
        int sub = max - min;
        int multiplation = max + 1;
        System.out.println("a = " + a);
        System.out.println("max int is " + max);
        System.out.println("min int is " + min);
        System.out.println("max + min is " + sum);
        System.out.println("max - min is " + sub);
        System.out.println("max * 2 is " + multiplation);

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
}
