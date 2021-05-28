package day03;

public class InnerClass1 {

}

class A{

    public static void main(String[] args) {
        A a=new A();
        a.testInnerB();
        a.testInnerC();
    }

    //类A调用匿名内部类innerB类的testB()方法
    public void testInnerB(){
        new innerB().testB();
    }
    //类B调用匿名内部类innerC类的testC()方法
    public void testInnerC(){
        new innerC().testC();
    }

    //一个类中可以有多个匿名内部类的继承
    private  class innerB extends B{
        @Override
        public void testB() {
            super.testB();
        }
    }

    private  class innerC extends C{
        @Override
        public void testC() {
            super.testC();
        }
    }
}

class B{
    public void testB(){
        System.out.println("这是B类的方法");
    }
}


class C{
    public void testC(){
        System.out.println("这是C类的方法");
    }
}
