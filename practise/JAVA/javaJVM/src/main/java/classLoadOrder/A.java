package classLoadOrder;

import sun.misc.Launcher;

/**
 * @author
 * @create 2018-01-03 10:52
 **/
public class A {

    public static void main(String[] args) {
/*        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println("==============");
        System.out.println(System.getProperty("java.ext.dirs"));*/
        System.out.println("=============");
//        System.out.println(System.getProperty("java.class.path"));

        System.out.println(B.class.getClassLoader());
        System.out.println(B.class.getClassLoader().getParent());
        System.out.println(B.class.getClassLoader().getParent().getParent());
        SecurityManager sm = System.getSecurityManager();
        Thread thread = new Thread();

    }
}
