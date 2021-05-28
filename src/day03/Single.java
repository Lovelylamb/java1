package day03;

/**
 * 单例模式-饿汉模式
 */
public class Single {
   // public Single(){//构造方法
        //假设构造方法中执行1000行代码，要占用很大的资源，耗时很时长10s;也意味着，每次new Single()需要10s,不符合设计要求，这种情况适合单例模
    //}

    private Single(){}                       //构造函数私有，不允许外部能产生这个类的对象
    private static Single single1 =new Single();   //new产生这个类的对象实例；这个对象实例不能公开（private），但能提供方法给外部使用
    public static Single getSingle(){   //static 修饰方法，可以让外部直接通过   类名.方法名，获取到这类的实例
        return single1;
    }
}

class singleTest{
    public static void main(String[] args) {
        Single s1 = Single.getSingle();
        Single s2 = Single.getSingle();
        System.out.println(s1 == s2);   //比较两个实例的内存地址
        System.out.println(s1.equals(s2));
    }
}
