package day01;

public class Person1 {

    private int age;   //private修饰的只能在本类使用

    public void setAge(int age){
        this.age =age;
    }

    private int getAge(){
        System.out.println(age);
        return age;
    }

    public static void main(String[] args) {
        Person1 person1 =new Person1();
        person1.setAge(16);
        person1.getAge();   //在本类中可以访问
    }
}


//测试在其他类中能否访问priavte

class Test2{
    public static void main(String[] args) {
        Person1 person1=new Person1();
        person1.setAge(2);
     //   person1.getAge();  //由于getAge（）方法在Person1中是私有的，所有在其他类中无法访问
    }
}
