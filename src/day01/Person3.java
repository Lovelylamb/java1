package day01;

/**
 * javaBean
 */
public class Person3 {
    private int age;
    private String name;
    private char sex;    //男或者女
    public Person3(){}

    public Person3(int age, String name, char sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}

class Test4{
    public static void main(String[] args) {
        Person3 person3=new Person3(23,"chenshuai",'男');
        System.out.println(person3.toString());
    }
}
