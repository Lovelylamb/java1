/**
 * 方法参数的传递
 * 总结：
 *      1、如果方法的形参是基本数据类型，那么实参（实际的数据）向形参传递参数时，就是直接传递值，把实参的值复制给形参
 *      2、如果方法的形参是对象，那么实参（实际的数据）向形参传递参数时，也是把值给形参，这个值是实参在栈内存中的值，也就是对象在堆内存中的地址；
 *
 * 基本数据类型都是保存在栈中的，引用对象在栈内存中保存的是该对象在堆内存的地址；
 * 方法的参数传递是值（变量在栈内存中的值）
 */
class TestTransfer{
    public static void swap(DataSwap ds1){
        ds1.a=6;
        System.out.println("swap这方法里, a的值是："+ds1.a);
    }

    public static void main(String[] args) {
        DataSwap dataSwap=new DataSwap();
        System.out.println("执行swap前，main方法里，a的值是"+dataSwap.a);
        swap(dataSwap);
        System.out.println("执行swap后，main方法里，a的值是"+dataSwap.a);
    }
}

public  class DataSwap {
    public int a;
}
