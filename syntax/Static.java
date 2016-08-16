import java.util.Date;

/*
 * static可以用来修饰类的成员方法,类的成员变量, 另外可以编写static代码快来优化程序性能.
 * 一 static关键字的用途
 * 1. static方法一般称作静态方法, 由于静态方法不依赖于任何对象就可以进行访问(也可以通过对象进行访问)
 *    因此, 也可以说对于静态方法来说是没有this的.
 *    即使没有显示的声明为static(实际上也不允许声明为static), 类的构造器其实也算静态方法.
 * 2. static变量
 *    static变量也称作静态变量, 静态变量和非静态变量的区别: 静态变量被所有的对象所共享, 在内存中只有一个副本,
 *    它当且仅当在类初次加载时被初始化. 而非静态变量是对象所拥有的, 在创建对象的时候被初始化, 因此只有通过对象名来访问.
 *    static变量的初始化顺序是按照定义的顺序进行初始化.(如何验证呢TODO)
 * 3. static 代码块
 *    static代码块用来形成静态代码块以优化程序性能. static块可以置于类中的任何地方. 类中可以有多个static块. 在类初次
 *    被加载的时候, 按照static快的顺序来执行每个static块, 并且只会执行一次.
 * 二 static关键字的误区
 * 1. static关键字不会改变类中成员的访问权限. 与C/C++中的static不同, java中影响权限的关键词只有public/private/protected
 * 2. 通过this可以访问静态成员变量
 */

class Static {
    public static void main(String[] args) {
        new MyObject().print1();
        new Person(new Date()).isBornBoomer();
    }
}

class MyObject {
    private static String str1 = "staticProperty";
    private String str2 = "property";
    
    public MyObject() {
        
    }
    
    public void print1() {
        System.out.println(str1);
        System.out.println(str2);
    }
    
    public static void print2() {
        System.out.println(str1);
    }
}

class Person {
    private Date birthDate;
    
    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    boolean isBornBoomer() {
        Date startDate = new Date();
        Date endDate = new Date();
        return birthDate.compareTo(startDate) >= 0 && birthDate.compareTo(endDate) < 0;
    }
}