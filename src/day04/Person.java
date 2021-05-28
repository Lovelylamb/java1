package day04;

public  class Person {
    String name;   //成员变量
    public final String STRING_NUMBER ="22";    //用final修饰的String常量
    //有参构造
    public Person(String name){
        this.name =name;
    }
    //无参构造
    public Person(){
        //可以初始化复制给成员变量
        this.name ="张三";
        System.out.println("执行的是无参构造方法"+this.name);
    }

    public final  void  Te(){
        System.out.println("你好");
    }

    //非静态代码块
    {
        System.out.println("执行的是非静态代码块NoStatic");
    }

    //static 静态代码块
    static {
        System.out.println("执行的是静态代码块Static");
    }

}

class Test{
    public static void main(String[] args) {
        Person person=new Person();
      //  System.out.println(person.name);
    }
}


class Person1 extends Person{

}
