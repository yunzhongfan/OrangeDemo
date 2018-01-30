package classLoadOrder;

/**
 * @author
 * @create 2018-01-03 10:52
 **/
public class ClassLoading {
    static String g = new String("abc");

    private static final String MESSAGE = "taobao";

    public static void main(String args[]) {
        /*A a=new A();
        a.aDisplay();

*/


        /*JVM测试*/
        int f = 3;
        int p = 3;
        String o = "mm";
        String o1 = "mm";
        System.out.println("JVM测试-------");
        String s = new String("abc");
        String w = new String("abc");
        System.out.println(s == w);
        System.out.println(g.equals(s));
        System.out.println(f == p);
        System.out.println(o == o1);


        System.out.println("JVM测试22-------");
        String a = "tao" + "bao";
        String b = "tao";
        String c = "bao";
        System.out.println(a == MESSAGE);
        System.out.println((b + c) == MESSAGE);


    }


}
