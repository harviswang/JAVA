import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.nio.channels.FileChannel;

public class FileOps {
    public static void main(String[] args){

        File s = new File("/home/ingenic/B/toolchain/gcc-arm-none-eabi-5_2-2015q4-20151219-src.tar.bz2");
        File t = new File("/home/ingenic/Desktop/fb_display.tar.bz2");
        File t2 = new File("/home/ingenic/Desktop/test");
        long start, end;

        start = System.currentTimeMillis();
        fileChannelCopy(s, t2);
        end = System.currentTimeMillis();
        System.out.println("fileChannelCopy consume " + (end-start) + "ms");

        start = System.currentTimeMillis();
        fileCopy(s, t);
        end = System.currentTimeMillis();
        System.out.println("fileCopy consume " + (end-start) + "ms");
    }

    public static void fileChannelCopy(File s, File t) {
        try {
            FileInputStream fi = new FileInputStream(s);
            FileOutputStream fo = new FileOutputStream(t);
            FileChannel fci = fi.getChannel();
            FileChannel fco = fo.getChannel();
            fci.transferTo(0, fci.size(), fco);

            fi.close();
            fo.close();
            fci.close();
            fco.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileCopy(File s, File t) {
        try {
            InputStream fis = new BufferedInputStream(new FileInputStream(s));
            OutputStream fos = new BufferedOutputStream(new FileOutputStream(t));
            byte[] buf = new byte[2048];
            int i;
            while ((i = fis.read(buf)) != -1) {
                fos.write(buf, 0, i);
            }

            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
