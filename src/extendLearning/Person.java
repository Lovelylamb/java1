package extendLearning;

/**
 * 父类：人类
 */
public class Person {
     int age;
     String name;
     String  sex;

    public Person(){}

    public Person(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public void showInfo(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(sex);
    }

}
