public class Person1 {
    public String name;
    private int age;   //private 私有，只能在本类使用

    public static void main(String[] args) {
        Person1 person1=new Person1();
        person1.age=1;
        person1.name="heLlo";
    }

}

class Test{
    public static void main(String[] args) {
        Person1 person1=new Person1();
        person1.name="nihao";
    }
}
