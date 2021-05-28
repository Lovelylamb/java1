package day01;

public class Person {
    //public int age;    //属性这是公开的

    private int age;  //应该隐藏

    public void setAge(int a){
        if(a<=150 && a>=0){
            age =a;
        }else {
            System.out.println("年龄："+a+"不在0-150之间");
        }
    }

    public int getAge(){
        return age;
    }

    public void printAge(){
        System.out.println("年龄是："+age);
    }
}

class Test{
    public static void main(String[] args) {
        Person P=new Person();
        P.setAge(12);
       // P.age=100;  //这种情况把age属性开放出来了
        P.printAge();
    }
}

