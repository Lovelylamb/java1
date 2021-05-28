package day05;

/**
 *抽象类A：被abstract修饰的类
 *
 */
abstract class A {
    abstract void m1();
    public void m2(){
        System.out.println("A类中定义的方法m2");
    }
}

/**
 * 类B继承抽象类A，必须实现抽象类A的抽象方法；
 */
class B extends A{

    @Override
    void m1() {
        System.out.println("B类中定义的m1方法");
    }
}

/**
 * 测试类
 */
class Test{
    public static void main(String[] args) {
        A a = new B();
        a.m1();            //B类中定义的m1方法
        a.m2();            //A类中定义的方法m2
    }
}


