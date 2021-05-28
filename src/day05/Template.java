package day05;

public abstract class Template {

    public abstract  void code();  //抽象方法

    public final void getTime(){
        long startTime = System.currentTimeMillis();   //开始时间
        code();    //调用抽象方法
        long endTime = System.currentTimeMillis();    //结束时间
        System.out.println("抽象方法的执行时间:"+(endTime-startTime));
    }
}
class TestTemplate extends Template{
    int k=0;
    @Override
    public void code() {
        for(int i=0;i<100000;i++){
            k =i;
            //System.out.println(i);
        }
        System.out.println(k);
    }
}

class  Test2{
    public static void main(String[] args) {
       TestTemplate testTemplate=new TestTemplate();
       testTemplate.getTime();
    }

}
