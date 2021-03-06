package reflection;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//分析性能问题
public class Test10 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test01();
        test02();
        test03();
    }


    //普通方式调用
    public static void test01(){
        User user =new User();
        long startTime =System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        long EndTime =System.currentTimeMillis();
        System.out.println("普通方式执行10亿次时间:"+(EndTime-startTime)+"ms");
    }

    //通过反射的方式
    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user =new User();
        Class c1 = user.getClass();
        Method getName = c1.getDeclaredMethod("getName", null);
        long startTime =System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }
        long EndTime =System.currentTimeMillis();
        System.out.println("反射方式执行10亿次时间:"+(EndTime-startTime)+"ms");
    }

    //通过反射的方式，关闭权限检测
    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user =new User();
        Class c1 = user.getClass();
        Method getName = c1.getDeclaredMethod("getName", null);
        getName.setAccessible(true);
        long startTime =System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }
        long EndTime =System.currentTimeMillis();
        System.out.println("反射方式（关闭检测）执行10亿次时间:"+(EndTime-startTime)+"ms");
    }
}
