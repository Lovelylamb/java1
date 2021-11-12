package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//动态的创建对象，通过反射
public class ReflectionTest08 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //第一种
        //1、获得class
        Class c1 = Class.forName("reflection.User");
       //2、构造一个对象
        User user = (User)c1.newInstance(); //本质是调用了类的无参构造器
        System.out.println(user);


        //第二种
        //通过构造器创建一个对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user1 = (User) constructor.newInstance("cs", 1, 1);
        System.out.println(user1);

        //第三种
        //通过反射获取调用普通方法
        User user2 = (User) c1.newInstance();
       /* user2.setName("张安");
        System.out.println(user2.getName());*/
        //通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        setName.invoke(user2,"张三");
        System.out.println(user2.getName());


        //通过反射操作属性
        System.out.println("============================");
        User user4=(User)c1.newInstance();
        Field name = c1.getDeclaredField("name");
        name.setAccessible(true);
        name.set(user4,"cs");
        System.out.println(user4);
    }
}
