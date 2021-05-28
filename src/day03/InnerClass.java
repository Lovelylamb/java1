package day03;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 内部类  ；在类中可以写类
 *  为什么会出现内部类；内部类主要解决java不能多重继承的问题
 */
public class InnerClass {
    public int age;
    int i;
    private String name;
    /**
     * 为何内部类中不能写静态方法
     * 静态的对象,在内存中实默认实例化的,在加载的时候就会存放到内存中。也就是可以直接调用而不需要手动实例化。理解这个就不难理解楼主说的问题了。首先内部的静态类他是不能直接被实例化的。你必须实例化外部类才能实例化它。而外部类不是默认加载的,他只有在手动实例化之后才有内存分配。
     */

    class InnerA{

        int i;
        //匿名内部类可以访问外部类的所有属性
        public void setField(){
          //  InnerClass.this.get();   //访问外部类的方法
            InnerClass.this.age = 2;
            InnerClass.this.i = 2;
            InnerClass.this.name ="加油";
        }

        public void setI(){
            this.i=i;
        }

    }


    public void get(){
        new InnerA().setField();
    }
    public void showInfo(){
        //get();     //调用设置属性变量值的方法
        System.out.println("年龄"+this.age +" i:"+i+" 名字："+name);
    }

    public static void main(String[] args) {
        InnerClass innerClass=new InnerClass();    //创建对象
        innerClass.get();
        innerClass.showInfo();
    }

}
