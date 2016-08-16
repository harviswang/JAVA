public class StringTest {
    public static void main(String[] args) {
        StringTest st = new StringTest();
        st.stringToByteTest("StringTest");
    }
    
    /*
     * String.length() == String.getBytes().length
     */
    public void stringToByteTest(String str) {
        System.out.println("str.length() = " + str.length());
        final byte[] cmd = str.getBytes();
        System.out.println("cmd.length = " + cmd.length);
    }
}