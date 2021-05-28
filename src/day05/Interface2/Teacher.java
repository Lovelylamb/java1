package day05.Interface2;

import day05.Template;

/**
 * 这个描述会唱歌的厨子是个老师
 * 继承Person1人类，实现Cooking 厨师的接口，实现Singing歌唱的接口
 */
public class Teacher extends Person1  implements Cooking,Singing{

    //老师这个职业自身的属性，教的课程
    String course;
    //重写继承的父类Person1中showInfo()抽象方法

    {
        super.age=2;
        super.name="熏儿";
        super.sex ='女';
        this.course="英语";
    }
    @Override
    public void showInfo() {
        System.out.println("会唱歌的厨子老师的信息："+"年龄： "+super.age+"名字： "+super.name+"性别： "+super.sex+"课程： "+this.course);
    }

    @Override
    public void fly() {
        System.out.println("会炒菜");
    }

    @Override
    public void sing() {
        System.out.println("会唱歌");
    }
}
class Test{
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.showInfo();
        teacher.fly();
        teacher.sing();
    }
}