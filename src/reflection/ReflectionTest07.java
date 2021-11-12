package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//获得类的信息
public class ReflectionTest07 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("reflection.User");
        //获得类的名字
        System.out.println(c1.getName());            //reflection.User   获得包名+类名
        System.out.println(c1.getSimpleName());      //User              获得类名

        System.out.println("============================");
        //获取类的属性
        Field[] fields = c1.getFields();  //只能找到pubLic属性(包括父类中的字段)
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("============================");
        Field[] declaredFields = c1.getDeclaredFields();  //能找到所有的属性，获得某个类的所有声明的字段，即包括public、private和proteced，但是不包括父类的申明字段。
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        System.out.println("============================");
        //获得指定属性的值
        Field name = c1.getDeclaredField("name");
        System.out.println(name);
        System.out.println("============================");
        //获取类的方法
        Method[] methods = c1.getMethods();      //获得本类及其父类的全部public方法
        for (Method method : methods) {
            System.out.println("正常的:"+method);
        }

        System.out.println("============================");
        Method[] declaredMethods = c1.getDeclaredMethods();  //获得本类的所有public方法
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declaredMethods"+declaredMethod);
        }

        //获得指定方法
        System.out.println("============================");
        Method getName = c1.getDeclaredMethod("getName", null);
        System.out.println(getName);

        Method setName = c1.getDeclaredMethod("setName", String.class);
        System.out.println(setName);

        //获得构造器
        System.out.println("============================");
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("============================");
        Constructor[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        //获得指定的构造器
        System.out.println("============================");
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println("指定的构造器"+declaredConstructor);
    }
}
