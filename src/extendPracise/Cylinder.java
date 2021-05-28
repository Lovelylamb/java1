package extendPracise;

/**
 * 圆柱   继承圆cirlce类型的半径，自己新增属性高度length；
 */
public class Cylinder extends Circle{

    public static void main(String[] args) {
        Circle circle=new Cylinder();   //派生类（子类）可以以基类（父类类型出现）
     //   Cylinder cylinder=new Cylinder();
        circle.findArea();  //派生类（子类）以基类（父类）的类型使用时，只能使用父类共有或重写的方法，即特有的属性和方法不可以使用；
       // Cylinder cylinder = (Cylinder) new Circle();  //子类引用指向父类对象
//        if(circle instanceof Circle){
//            System.out.println("正常的父子关系");
//        }

        System.out.println(circle instanceof Object);
        System.out.println(circle instanceof Circle);
        System.out.println(circle instanceof Cylinder);
    }

    private double length;   //圆柱的高度

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double findArea() {
        //Double  b = 445.5;
       // return b;
        return super.findArea();   //super调用父类的findArea方法
    }

    //圆柱的体积方法
    public double findVolume(){
         double s=findArea();
         return length *s;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "length=" + length +
                '}'+"圆柱的体积是"+findVolume();
    }
}
