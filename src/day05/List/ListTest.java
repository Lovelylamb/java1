package day05.List;

import java.util.ArrayList;
import java.util.List;

/**
 * list集合
 * list是元素有序且可重复的集合，集合中每个元素都有其对应的顺序索引
 * list允许使用重复元素，通过索引来访问指定位置的集合元素
 * list默认按元素的添加顺序设置元素的索引
 * list集合里添加了一些根据索引来操作集合元素的方法
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");   //添加元素
        list.add("b");
        list.add("v");
        list.add("d");
        list.add("k");
        list.add("f");
        System.out.println(list);    //打印集合list     [a, b, v, d, k, f]
        System.out.println(list.get(3));  //按照集合索引获取元素    d
        list.add(3,"ttt");  //在指定元素的位置插入集合元素
        System.out.println(list);    //打印集合list   [a, b, v, ttt, d, k, f]

        List<String> l = new ArrayList<>();
        l.add("你好");
        l.add("世界");
        //list集合一个个添加
        list.add(2,l.get(0));
        list.add(3,l.get(1));

        //集合元素所有都添加
        list.addAll(2, l );    //addAll()添加所有集合的元素
        System.out.println(list);  //[a, b, 你好, 世界, 你好, 世界, v, ttt, d, k, f]
        System.out.println(list.indexOf("你好")); //查找指定元素在集合中第一次出现的下标    2
        System.out.println(list.lastIndexOf("你好")); //查找指定元素在集合中第一次出现的下标    4



        list.set(1,"helloworld");   //修改指定下标的元素值
        System.out.println(list);   //[a, helloworld, 你好, 世界, 你好, 世界, v, ttt, d, k, f]

        List<String> list2 = list.subList(2,5);   //subList()方法是截取的方法；
        System.out.println(list2);
        //上下两个能达到同样的效果
        System.out.println(list.subList(2,5));  //[你好, 世界, 你好]
    }
}
