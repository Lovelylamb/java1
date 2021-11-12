package annotation;

import java.util.ArrayList;
import java.util.List;

//注解
public class AnnotationTest1  extends  Object{

    //@Override  重写注解
    @Override
    public String toString() {
        return super.toString();
    }

    //废弃注解
    //Deprected 不推荐程序员使用，但是可以使用，或者存在更好的方式
    @Deprecated
    public static  void test()
    {
        System.out.println("Deprected");
    }

    @SuppressWarnings("all")
    public void test02()
    {
        List list=new ArrayList();
    }

    public static void main(String[] args) {
        test();
    }
}
