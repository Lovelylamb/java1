import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

/**
 * @author:chenshuai
 * */
public class Person {
    //属性，成员变量，类的成员变量可以先声明，不用初始化；    类成员变量有默认值
    String name;  //名字  String 的默认值为null
    int age;   //年龄     int 的默认值为0

    //行为，方法，也叫函数
    public void  showName(){    //方法名建议驼峰命名
        System.out.println("打印姓名:"+name);
    }

    /**
     *获取年龄
     * @return
     * */
    public int getAge(){
        return age;
    }


}

class Test111{
    public static void main(String[] args) {
        Field[] declaredFields = Person.class.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
            if(declaredField instanceof ParameterizedType){

            }
        }
    }

}
