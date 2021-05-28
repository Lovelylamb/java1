package extendLearning;

import extendPracise.Mankind;

/**
 * 子类：学生类
 * 相比人类多了个学校的属性
 */
public class Student extends Person{
    String school;
    String school2;

    public static void main(String[] args) {
       // Student student=(Student) new Person();   //会报错类型转换异常  java.lang.ClassCastException
        Student s=new Student(1,"张三","男");   //实例化对象
        s.school ="试验中心小学";
        s.showInfo();             //调用对象中的方法
        System.out.println(new Person() instanceof Student);   //false
    }
    public Student() {}       //子类写无参构造函数，必须满足父类存在无参构造函数，如果父类已经存在有参函数，那么就写一个无参构造函数

    public Student(String school){
        this.school =school;
    }
    //this可以调用本类的其他构造函数
    public Student(String school,String school2){
        this("nihao");
        this.school2=school2;
    }



    public Student(int age, String name, String sex) {
        super(age, name, sex);    //使用super 来调用父类的有参构造函数
    }

    public Student(int age, String name, String sex, String school) {
        super(age, name, sex);
        this.school = school;
    }

    @Override
    public void showInfo() {
      //  super.showInfo();  //super调用的父类的方法，这里子类可以重写父类的方法，增强类的复用性
     //   this.school="实验小学";
        System.out.println(this.name+this.school+this.sex+this.age);
    }



}
