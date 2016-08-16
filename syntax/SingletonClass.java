/*
 * Java单例模式例子
 * Java中单例模式定义：“一个类有且仅有一个实例，并且自行实例化向整个系统提供。”
 */
public class SingletonClass {
    private static SingletonClass instance = null;
    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized(SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }
    
    public static void main(String[] args) {
        SingletonClass sc = SingletonClass.getInstance();
        System.out.println(sc);
        SingletonClass sc2 = SingletonClass.getInstance();
        System.out.println(sc2);
    }
}
