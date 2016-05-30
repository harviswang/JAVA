import java.util.ArrayList;
import java.util.List;

/*
 * java -XX:PermSize=10M -XX:MaxPermSize=10M ConstantOOM
 * -XX:PermSize=10M -XX:MaxPermSize=10M works with jdk 1.6, but jdk 1.7 not
 */
public class ConstantOOM {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}