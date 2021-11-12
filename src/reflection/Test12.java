package reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

//练习反射操作注解
public class Test12 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("reflection.Student2");
        //通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        //获得注解的value值
        TableKuang tableKuang = (TableKuang) c1.getAnnotation(TableKuang.class);
        String value = tableKuang.value();
        System.out.println(value);

        //获得类指定的注解
        Field f= c1.getDeclaredField("name");
        Fieldkuang annotation = f.getAnnotation(Fieldkuang.class);
        System.out.println(annotation);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());
    }
}

@TableKuang("db_Student")
class Student2{

    @Fieldkuang(columnName = "db_id",type="int",length=10)
    private int id;
    @Fieldkuang(columnName = "db_age",type="int",length=10)
    private int age;
    @Fieldkuang(columnName = "db_name",type="varchar",length=10)
    private String name;

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//类名的注解
@Target(value=ElementType.TYPE)
@Retention(value=RetentionPolicy.RUNTIME)
@interface TableKuang{
    String value();
}

//属性的注解
@Target(value=ElementType.FIELD)
@Retention(value=RetentionPolicy.RUNTIME)
@interface Fieldkuang{
    String columnName();
    String type();
    int length();
}