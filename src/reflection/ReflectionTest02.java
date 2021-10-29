package reflection;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//测试class类的创建方式有哪些
public class ReflectionTest02 {

    public static void main(String[] args) throws ClassNotFoundException {
        Person person=new Student();
        System.out.println("这个人是："+person.name);

        //方式一：通过对象获得
        Class c1=person.getClass();


        //方式二；使用forname获得
        Class c2 = Class.forName("reflection.Student");

        //方式三：通过类名获得
        Class c3=Student.class;

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        //方式四：基本内置类型的包装类都有一个Type属性
        Class c4=Integer.TYPE;

        //获得父类类型
        Class c1Superclass = c1.getSuperclass();
        System.out.println(c1Superclass);
    }


}

class Person {
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends  Person
{
    public Student(){
        this.name="学生";
    }

   /* public Student(String name) {
        super(name);
    }*/
}

class Teacher extends  Person
{
    public Teacher(){
        this.name="老师";
    }

   /* public Student(String name) {
        super(name);
    }*/
}