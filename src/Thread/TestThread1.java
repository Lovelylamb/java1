package Thread;

//创建线程方式一：继承Thead类，重写run()方法，调用start()开启线程
public class TestThread1 extends Thread{
    @Override
    public void run() {
        //run方法线程体
        for(int i=0;i<20;i++){
            System.out.println("我在看代码---"+i);
        }
    }

    //mian方法，主线程
    public static void main(String[] args){
        //创建一个线程对象
        TestThread1 testThread1 =new TestThread1();
        //调用start()开启线程
        testThread1.start();

        for(int i=0;i<20;i++){
            System.out.println("我在学习多线程--"+i);
        }
    }
}
