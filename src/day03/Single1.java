package day03;

/**
 * 单例模式-懒汉式
 * 一开始实例变量是为null,等需要用到的时候再new一个对象
 */
public class Single1 {

    //私有的构造函数
    private Single1(){}
    //因为静态方法中调用到该类的对象，因此这个对象也必须是静态的
    private static Single1 single1 = null;
     //static修饰方法，为了提供给外部获取该单例类的实例
    public static Single1 getSingle1(){
        if(single1 ==null){
            single1= new Single1();
        }
        return single1;
    }
}

class Single1Test{
    public static void main(String[] args) {
        Single1 s1 = Single1.getSingle1();
        Single1 s2 = Single1.getSingle1();
        Single1 s3 = Single1.getSingle1();
    }
}
