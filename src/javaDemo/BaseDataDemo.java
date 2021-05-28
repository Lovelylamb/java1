package javaDemo;

public class BaseDataDemo {
    public static void main(String[] args) {
        int i=128;
        byte b = (byte)i;

        System.out.println(i);
        System.out.println(b);

        int money=10_0000_0000;
        System.out.println(money);

        int year = 20;
        int total =money*year;  //计算的时候溢出了
        System.out.println(total);  //-1474836480

        long total1 =money*year; //默认是int,转换之前已经存在问题了
        System.out.println(total1); //-1474836480

        long total2 = money*((long)year);   //先把一个数据转换成long
        System.out.println(total2);  //20000000000
    }
}
