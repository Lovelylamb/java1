/**
 * 练习题：计算圆形面积
 */
public class CacluateCircularArea {
    public  int r;
    public static double Π=3.1415926;

    public double getArea(double r){
        return r * r * Π;
    }

}

class Test1{
    public static void main(String[] args) {
    double area = new CacluateCircularArea().getArea(6);
        System.out.println("圆的面积："+area);
    }
}
