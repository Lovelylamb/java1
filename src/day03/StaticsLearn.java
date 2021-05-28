package day03;

/**
 * 静态关键字Statics
 */
public class StaticsLearn {
   //String name;
   String name;   //静态成员变量
   static String country;
   int age;


}
class Test{
    public static void main(String[] args) {
        StaticsLearn.country ="中国";             //静态属性调用         类名.属性名
        StaticsLearn staticsLearn = new StaticsLearn();
        staticsLearn.name= "张三";
        staticsLearn.age= 1;
        StaticsLearn staticsLearn1 = new StaticsLearn();
        staticsLearn1.name= "张三";
        staticsLearn1.age= 1;
        StaticsLearn staticsLearn2 = new StaticsLearn();
        staticsLearn2.name= "李四";
        staticsLearn2.age= 2;
        System.out.println(StaticsLearn.country);

    }
}
