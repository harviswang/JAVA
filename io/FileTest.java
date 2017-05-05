// vim: tw=4 ts=4 autoindent expandtab
// public class File extends Object implement Serializable, Comparable<File>
// An absract representation of file and directory pathname.
//
import java.lang.Object;
import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        FileTest ft = new FileTest();
        ft.constructorTest();
        ft.statTest();
    }

    public void constructorTest() {
        File parent = new File("zstack");
        File child = new File(parent, "dashboard");
        System.out.println(child);
        if (!child.exists()) {
            child.mkdirs();
        }
    }

    public void statTest() {
        try {
            File file = createTempFile("hello", "world");
            if (!file.exists()) {
                file.createNewFile();
            }
            System.out.println(file + " canExecute: " + file.canExecute());
            System.out.println(file + " canRead: " + file.canRead());
            System.out.println(file + " canWrite: " + file.canWrite());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
