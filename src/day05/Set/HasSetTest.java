package day05.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 集合的知识，HashSet实现了set接口，set接口继承了Collection接口
 */
public class HasSetTest {
    public static void main(String[] args) {
       Set set=new HashSet();
        set.add(1);             //给集合添加元素
        set.add("2");
        System.out.println(set);

        set.remove(1);   //移除元素
        System.out.println(set.contains("2"));//判断是否包含元素
        set.clear();     //清空集合

        /**
         * 遍历集合
         * 1、迭代器遍历
         * 2、foreach迭代
         */
        Set set1=new HashSet();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("d");
        set1.add("e");
        set1.add(null);//  HashSet集合不保证集合顺序
        set1.add("e"); //HashSet不能添加重复元素

        //第一种遍历的方法
        Iterator iterator=set1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        //第二种遍历的方法
        for (Object obj:set1) {
            System.out.println(obj);
        }

        //查看集合的大小
        System.out.println(set1.size());

    }
}
