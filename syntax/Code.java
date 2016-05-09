public class Code {
    public static void main(String args[]) {
        dumpChineseChar();
    }

    public static void dumpChineseChar() {
        for(char c = '\u4e00'; c < '\u9fbf'; c += 16) {
            int i = 0;
            System.out.print(" " + (char)(c + i));
            for (i = 1; i < 16; i++) {
                System.out.print(" " + (char)(c + i));
            }
            System.out.println();
        }
        System.out.println('\u9fbf' - '\u4e00');
    }
}
