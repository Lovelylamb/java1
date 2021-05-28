package day02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import extendLearning.Person;

public class EqualsTest {
    public static void main(String[] args) {
        int i=3;
        int j=3;
        System.out.println(i==j);   //true 比较值
        String str = new String("hello");
        String str1 = new String("hello");
        System.out.println(str==str1);               //false
        System.out.println(str.equals(str1));        //true


        Person p1=new Person();
        Person p2=new Person();
        Person p3=p2;
        System.out.println(p1==p2);  //false    比较地址
        System.out.println(p1.equals(p2));   //false
        System.out.println(p2==p3);     //true


        String stt1="1";
        String stt ="2";
        String stt2 ="12";
        System.out.println(stt2 == (stt1+stt));           //false
        System.out.println(stt2.equals(stt1+stt));        //true
    }

}
