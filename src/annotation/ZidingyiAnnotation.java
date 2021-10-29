package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解
public class ZidingyiAnnotation {

    //注解可以显示赋值，如果没有默认值，我们就必须注解赋值
    @MyAnnotation2(name = "hello")
    public void test(){}

    @MyAnnotaion3("TEST")
    public void test2(){}
}


@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {

    //注解的参数：   参数类型 + 参数名()；
    String name() default "";
    int    age() default 0;
    int id() default -1; //如果默认值为-1，代表不存在，indexof，如果找不到就返回-1

    String[] schools() default {"清华大学"};
}


@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface  MyAnnotaion3{
    String value();  //如果只有一个参数，建议用value命名
}