package day05.Exception;

public class Test {
    public static void main(String[] args) {
        String[] art = {"as","dfdf","dfeewe"};
        for (int i=0;i<art.length;i++){
            System.out.println(art[i]);
        }

        /**
         * 异常一：数组越界
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
         */

//        for (int j=0;j<=art.length;j++){
//            System.out.println(art[j]);
//        }


        /**
         * 异常二:空指针异常
         * java.lang.NullPointerException
         */
//        A a= null;
//        System.out.println(a.i);


        /**
         * 异常三:计算异常
         * java.lang.ArithmeticException: / by zero
         */
        int i=0;
        try {
            System.out.println(3 / i);
        } catch (Exception e) {
            //throw new ArithmeticException("被除数不能为0");
            // System.out.println("被除数不能为0");
            e.printStackTrace();
        }
    }
}
class A{
    int i;
}
