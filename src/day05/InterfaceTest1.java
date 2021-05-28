package day05;

/**
 * 接口类
 * 只有常量和抽象方法；可以多实现，接口也可以继承接口
 */
public interface InterfaceTest1 {
    int ID =1;   //这个等价于  public static final int ID = 1;
    void test(); //抽象方法等价于  public abstract void test();
}

interface  Inter1{
    void testInter1();
}


//单实现；
class TestInterface implements InterfaceTest1{
    @Override
    public void test() {
        System.out.println("单实现");
    }
}

//多实现
class  TestInterface1 implements InterfaceTest1,Inter1{

    @Override
    public void test() {
        System.out.println("多实现InterfaceTest1中的抽象方法"+" id:"+InterfaceTest1.ID);
    }

    @Override
    public void testInter1() {
        System.out.println("多实现Inter1中的抽象方法"+InterfaceTest1.ID);
    }
}

class Test3{
    public static void main(String[] args) {
        TestInterface1 testInterface1=new TestInterface1();
        testInterface1.test();
        testInterface1.testInter1();
    }
}
