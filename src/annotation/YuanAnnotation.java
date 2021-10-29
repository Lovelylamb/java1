package annotation;


import java.lang.annotation.*;

//测试元注解
@MyAnnotation
public class YuanAnnotation {

    @MyAnnotation
    public void test(){};
}

//定义一个注解,Target表示我们的注解可以用在什么地方,
//@Target(value = ElementType.METHOD)
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//@Target(ElementType.METHOD)

//Retention表示我们的注解在什么地方还有效，一共三个 源码 RESOURCE < class文件 CLASS <运行时 RUNTIME
@Retention(value = RetentionPolicy.RUNTIME)

//Documented表示是否将我们的注解生成在javadoc中
@Documented

//Inherited子类可以继承父类的注解
@Inherited
@interface  MyAnnotation{}