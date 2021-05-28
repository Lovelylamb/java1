package day05.Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * treeSet有序排列（自然排列）
 * 特点：有序的
 *      元素不可重复
 *      不能为空，会报错“java.lang.NullPointerException”
 */
public class TreeSetTest {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(5);  //添加元素
//        set.add(5);
//        set.add(null);
        set.add(2);
        set.add(4);
        set.add(9);
        System.out.println(set);    //结果是[2, 4, 5, 9] ,自然排序
        set.remove(2);  //移除元素
        System.out.println(set.contains(9));   //校验元素是否包含在集合中
        System.out.println(set.size());//元素的长度
        set.clear();    //清空集合
        //遍历一
        Iterator<Integer> iteratorIterator=set.iterator();
        while(iteratorIterator.hasNext()){
            System.out.println(iteratorIterator.next());
        }
        //遍历二
        for( Integer t:set){
            System.out.println(t);
        }

    }
}

class Test{
    public static void main(String[] args) {
        Person person=new Person(18,"张三");
        Person person1=new Person(19,"珍妮");
        Person person2=new Person(11,"小三");
        Person person3=new Person(40,"李子");
        Person person4=new Person(14,"玄武");
        Person person5=new Person(17,"骆冰");
        Set<Person> set =new TreeSet<>(new Person());
        set.add(person);
        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person4);
        set.add(person5);
        for(Person p:set){
            System.out.println(p.age+" "+p.name);
        }
      //  Comparator<Person> c =new Person();    //接口的实现类的多态
    }
}

//创建一个Person类，满足person对象存入TreeSet中，按照年龄进行排序
class Person  implements Comparator<Person> {
    int age;
    String name;

    public Person(){}

    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public int compare(Person o1, Person o2) {//对人进行按照年龄的排序

        if(o1.age>o2.age){
            return 1;
        }else if(o1.age<o2.age){
            return -1;
        }else{
             return 0;
        }

    }
}
