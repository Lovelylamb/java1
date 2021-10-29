package reflection;

public class ReflectionTest04 {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(A.m);
    }
}


class A{
    public A() {
        System.out.println("A类的无参构造初始化");
    }
    static int m=100;
    static{
        System.out.println("A类的静态代码块初始化");
        m=300;
    }


}