package day02;


public class CastTransfer {

    public static void main(String[] args) {
        String s= "hello";
        Object object =s;     //因为 object类是所有类的父类，所以String类型可以转为Object类型

        Object object1=new Object();
        //String s1= (String) object1;    //编译没有问题，运行会报错java.lang.Object cannot be cast to java.lang.String
        String s1=object1.toString();     //object类的toString()方法，将其他类转化为String类型
        System.out.println(s1);


        Object object2="jiyou";
        String s2 = (String) object2;
        System.out.println(s2);

//        1.直接使用tosting的方式 
//
//        String str = entry.value().toString(); 
//
//        2.使用String类的静bai态方法valueOf()
//        String str = String.valueOf(entry.value());
    }

}
