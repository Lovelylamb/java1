package day02;

import extendLearning.Person;
import extendLearning.Student;
import extendPracise.Circle;

public class Test1 {
    /**
     * 问题：想给test方法设置一个形参参数，这个参数不确定什么类型，可以确定的是传递实参一定会是一个类，那么test方法的形参要设置一个什么类型
     *
     */
    public void test(Object object){

    }

    public static void main(String[] args) {
        Test1 test1=new Test1();
        Person person= new Person();
        Student student=new Student();
        test1.test(person);
        test1.test(student);
        test1.test(new Circle());    //new Circle()  匿名对象，因为这里使用一次
        System.out.println(person.equals(student));
    }
}
