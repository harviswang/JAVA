import java.util.List;
import java.util.ArrayList;

/*
 * 测试jvm堆分配OOM
 * 所有对象的实例分配都在Java堆上分配内存
 * java -Xmx2M -Xms2M HeapOOM
 * -Xmsn : Specify the initial size, in bytes, of the memory allocation pool. > 1M
 * -Xmxn : Specify the maximum size, in bytes, of the memory allocation pool. >= 1M
 */
public class HeapOOM {
    static class OOMObject {}
    
    /**
     * @param
     */
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        
        while (true) {
            list.add(new OOMObject());
        }
    }
}