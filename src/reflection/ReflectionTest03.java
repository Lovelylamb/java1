package reflection;

import java.lang.annotation.ElementType;

/*
哪些类型可以有Class对象

class:外部类，成员（成员内部类，静态内部类），局部内部类，匿名内部类。
interface: 接口
[]:数组
enum:枚举
annotation:注解@interface
primitive type:基本数据类型
void
* */
public class ReflectionTest03 {
    public static void main(String[] args) {

        Class c1 = Object.class;     //类
        Class c2 = Comparable.class; //接口
        Class c3 = String[].class; //数组
        Class c4 = int[][].class;  //数组
        Class c5 = Override.class;  //注解类型
        Class c6 = ElementType.class; //枚举类型
        Class c7 = Integer.class; //基本数据类型
        Class c8 = Class.class;  //Class
        Class c9 = Void.class;  //Void
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);

        //只要元素类型与维度一样，就是同一个class
        int[] a=new int[10];
        int[] b=new int[100];

        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());
    }
}
