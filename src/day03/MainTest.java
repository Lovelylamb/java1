package day03;

/**
 * 详解main方法
 * public修饰，因为虚拟机需要调用这个方法，所以要公开
 * static    因为java虚拟机再调用main方法时不需要创建对象
 * void      不需要返回内容
 * main     方法名
 * String[]  字符串数组， 该数组中保存执行java命令时传递给所运行类的参数；
 */
public class MainTest {
    //
    public static void main(String[] args) {
      for(int i=1;i<args.length;i++){
          System.out.println(args[i]);
      }
    }
}

