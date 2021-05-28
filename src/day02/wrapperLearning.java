package day02;
/**
 * 包装类   现在jdk支持自动装箱和自动拆箱
 */
public class wrapperLearning {
    public static void main(String[] args) {
        //通过包装类的构造器实现     --装箱
        int i=9;
        Integer integer=new Integer(i);
        System.out.println( i == integer);     //true
        System.out.println( integer.equals(i)); //true
       //通过字符串参加构造器函数
        Float f=new Float('c');
       // Float f1=new Float("c");       // 报错java.lang.NumberFormatException: For input string: "c"，要把c改为数字
        Float f1=new Float("1f");
        Long l =new Long("1234242");
        System.out.println(f+" "+l);

        //获得包装类对象中包装的基本类型变量  --拆箱
        Boolean bool =new Boolean(true);
        boolean b=bool.booleanValue();
        System.out.println(b);


        //字符串转为其他基本数据类型
        int ii =Integer.parseInt("1");
        float fi=Float.parseFloat("7.0f");
        boolean bb=Boolean.parseBoolean("true");

        //基本数据类转为字符串
        String s1=String.valueOf(ii);
        String s2=String.valueOf(fi);
        String s3=String.valueOf(bb);
    }
}
