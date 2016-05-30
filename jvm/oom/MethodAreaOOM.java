import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.objectweb.asm.ClassVisitor;

import org.objectweb.asm.Type;

import java.lang.reflect.Method;

/*
 * 编译: javac -cp ./asm-5.1.jar:./cglib-3.2.2.jar:./ MethodAreaOOM.java
 * 运行: java -XX:PermSize=10M -XX:MaxPermSize=10M -cp ./asm-5.1.jar:./cglib-3.2.2.jar:./ MethodAreaOOM
 */
public class MethodAreaOOM {
    static class OOMObject {}
    
    public static void main(String[] args) {
        while (true) {
            Enhancer eh = new Enhancer();
            eh.setSuperclass(OOMObject.class);
            eh.setUseCache(false);
            eh.setCallback(new MethodInterceptor() {
               @Override
               public Object intercept(Object arg0, Method arg1, 
                       Object[] arg2, MethodProxy arg3) throws Throwable {
                   return arg3.invokeSuper(arg0, arg2);
               }
            });
            eh.create();
        }
    }
}