package day05.Exception;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test1 {
    public static void main(String[] args) {
           B b=new B();
        try {
            b.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class B{
    int i;
    B b2=null;
    public void test() throws Exception{
       // B b=null;
        System.out.println(b2.i);
    }

}
