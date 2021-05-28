package day01;

/**
 * 构造器中调用this，必须放在首行
 *
 */
public class Person2 {
    int age;
    String name;
    public Person2(){}  //无参构造

    public Person2(int age){
        this.age=age;
    }

    public Person2(String name){
        this(1);   //this可以调用构造方法
        this.name =name;
    }

    public Person2(int age,String name){
        this("jiayou");
        this.age=age;   //this可以调用成员变量
        this.name=name;
    }

    public void setAge(int age){
        this.age =age;
    }

    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Test3{
    public static void main(String[] args) {
        Person2 person2=new Person2("hh");
        System.out.println(person2.toString());
    }
}
