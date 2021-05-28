public class Demo {
    public static void main(String[] args) {
        float f =0.1f;
        double d=1.0/10;
        System.out.println(f==d);

        float f1=12454545454f;
        float f2=f1+1;
        System.out.println(f1==f2);


        char c1='a';
        char c2='中';
        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((int)c2);

        char c3 ='\u0061';
        System.out.println(c3);

        //转移字符
        System.out.println("ni\thao");
        System.out.println("ni\nhao");


        System.out.println("==========================================");
        String sa =new String("hello world");
        String sa1 =new String("hello world");
        System.out.println(sa==sa1);   //false

        String sc ="hello world";
        String sd ="hello world";
        System.out.println(sc==sd);    //true


    }
}
