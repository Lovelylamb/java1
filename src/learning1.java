/**
 * 变量的分类：  成员变量和局部变量
 *
 * 成员变量；①使用static修饰的是类变量，可以直接使用类名调用；不需要实例化  ②实例变量
 * 局部变量：①形参（方法签名中定义的变量） ②方法局部变量（在方法内定义） ③代码块局部变量（在代码块中定义）
 *
 * 类的访问机制；
 * 1、在一个类中的访问机制：类中的方法可以直接访问类中的成员变量（例外：static方法访问非static成员变量，编译不通过）；
 * 2、在不同类中的访问机制：先创建要访问类的对象，再用对象访问类中定义的成员
 */
public class learning1 {
    /**
     * 成员变量
     */
    public String name;    //成员变量（实例变量），类里面的
    private int age;       //成员变量（实例变量），类里面的
    private static int age1;   //成员变量（类变量）
    public static String name1="heihei";    //成员变量（类变量） 类变量直接使用类名来调用

    /**
     * 局部变量1：在方法的签名中，形参
     * @param food
     */
    public void eat(String food){
        String food1="桃子";   //局部变量2：方法内的
        System.out.println("食物:"+food);
    }

    /**
     * 局部变量3：在代码块中
     */
    {
        int age=2;
        System.out.println("你好"+age);
    }
}

class Test22{
    public static void main(String[] args) {
        System.out.println(learning1.name1);    //直接打印出类变量    （格式：类名.类变量）
        learning1 learning1=new learning1();    //创建对象
    }

}
