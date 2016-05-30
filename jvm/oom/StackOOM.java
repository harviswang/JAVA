/*
 * java -Xss160K StackOOM
 */
public class StackOOM {
    private int stackLength = 1;
    
    public void stackLeak() {
        stackLength++;
        stackLeak();
    }
    
    private void dontStop() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run () {
                    dontStop();
                }
            });
            t.start();
            stackLength++;
        }
    }
    
    public static void main(String[] args) throws Throwable {
        StackOOM oom = new StackOOM();
        try {
            //oom.stackLeak();
            oom.stackLeakByThread();
        } catch (Throwable err) {
            System.out.println("Statck length:" + oom.stackLength);
            throw err;
        }
    }
}