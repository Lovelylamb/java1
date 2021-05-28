package extendPracise;

public class TestCylinder {
    public static void main(String[] args) {
        //计算圆的面积
        Circle circle=new Circle();
        circle.setR(16);
        circle.findArea();
        System.out.println(circle.toString());
        //计算圆柱的体积
        Cylinder cylinder=new Cylinder();
        cylinder.setLength(7.8);
        cylinder.setR(4);
        cylinder.findVolume();
        System.out.println(cylinder.toString());
    }
}
