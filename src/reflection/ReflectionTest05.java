package reflection;

//测试类什么时候会初始化
public class ReflectionTest05 {
    static {
        System.out.println("Main被初始化");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        //1、主动引用
       // Son son=new Son();

        /*结果如下：
        * Main被初始化
            父类被加载
             子类被加载
        * */
        //2、反射也会产生主动引用
       // Class aClass = Class.forName("reflection.Son");

        //3、不会产生类的引用方法
       // System.out.println(Son.b);

       // Son[] arraru=new Son[5];   //数组不会初始化

        System.out.println(Son.M);

    }

}
class Father{
    static int b=2;

    static{
        System.out.println("父类被加载");
    }
}

class Son extends Father{
    static{
        System.out.println("子类被加载");
        m=300;
    }
    static int m=100;
    static final int M=1;
}
