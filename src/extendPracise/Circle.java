package extendPracise;

/**
 * 圆：  属性 r是半径
 */
public class Circle {
    private double r ;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    //计算圆面积的方法
    public double findArea(){
        return 3.14 *r *r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                "'}圆的面积是：'"+findArea();
    }
}
