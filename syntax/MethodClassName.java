/**
 * How the method name and class name
 * @author Harvis
 */

public class MethodClassName {
    public static void main(String[] args) {
        MethodClassName mcn = new MethodClassName();
        mcn.printThis();
        Apple.main(null);
        System.out.println("current class.method is: "
                + getCurrentClassName() + "." + getCurrentMethodName());
    }
    
    /**
     * get the method name of who invoked printCurrentMethodName
     */
    static String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
    
    void printThis() {
        System.out.println("this is: " + this.toString());
    }

    /**
     * get the class name of the method in which invoked printCurrentMethodName
     */
    static String getCurrentClassName() {
        return Thread.currentThread().getStackTrace()[2].getClassName();
    }
}

class Apple {
    public static void main(String[] args) {
        System.out.println("current class.method is: " 
                + MethodClassName.getCurrentClassName() + "." 
                + MethodClassName.getCurrentMethodName());
    }
}
