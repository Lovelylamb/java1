/**
 * 方法的可变个数的参数
 */
public class Person3 {
    /**
     * 使用数组的方式传递可变个数参数
     * 注意：如果没有参数，就要定义一个数组或者填null
     * @param arr
     */
    public void printInfo(String[] arr){  //问题是：能够打印的信息都要来源于方法的参数
        for (int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
        }
    }

    /**
     * 使用java特有的方式传递可变个数参数
     * 注意：如果没有参数，就可以不填写
     * 这种...代表可以传递0到多个参数
     * 而且一个方法有多个形参，可变参数需要放到形参最后;  如：printInfo1(int age , String... arr)
     * @param arr
     */
    public void printInfo1(String... arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    //两个可变参数;不可以，会报错
//    public void printInfo2(String... arr,int... t){
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }

}
class Test5{
    public static void main(String[] args) {
     Person3 person3=new Person3();
     String[] argt ={"zhanga","lisi","wangwu"};
     person3.printInfo(argt);
    }

}
