package test;

/**
 * @author
 * @create 2018-01-26 10:19
 **/
public class ClassLoaderTest {
    public static void main(String[] args) {
        Object ob = ClassLoader.getSystemClassLoader();
        this.getClass().getClassLoader().loadClass( "sdsa" );


    }
}
