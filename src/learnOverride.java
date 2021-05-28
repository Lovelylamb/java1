/**
 * 方法的重载
 *  概念：在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可；
 *
 *  重载的特点 :
 *          与返回值类型无关， 只看参数列表，且参数列表必须不同（参数个数或者参数类型）。调用时根据方法参数列表的不同来区别；
 *  重载示例：
 *     int add(int x,int y){return x+y;}  //返回两个整数的和
 *     int add(int x,int y,int z){return x+y+z;}  //返回三个整数的和
 *     double add(double x,double y){return x+y;}  //返回两个整数的和
 */
public class learnOverride {
    int add(int x,int y){return x+y;}  //返回两个整数的和
    int add(int x,int y,int z){return x+y+z;}  //返回三个整数的和
    double add(double x,double y){return x+y;}  //返回两个整数的和
    //输出平方
    public void mol(int x){
        System.out.println(x*x);
    }

    public void mol(int x,int y){
        System.out.println(x * y);
    }

    public void mol(String str){
        System.out.println(str);
    }

    //判断两个值的最大值(int类型)
    public void max(int x,int y){
        //第一种方法if
        if(x>y){
            System.out.println(x);
        }else{
            System.out.println(y);
        }
       //第二种方法 三目运算符
        System.out.println(x>y?x:y);
    }

    //判断两个值的最大值（double类型）
    public void max(double x,double y){
        //第一种方法if
        if(x>y){
            System.out.println(x);
        }else{
            System.out.println(y);
        }
        //第二种方法 三目运算符
        System.out.println(x>y?x:y);
    }

    //判断三个值的最大值（double类型）
    public void max(double a,double b,double c){
        //第一种方法 if
        if(a>b){
            if(a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else{
            if(b>c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }

        //第二种方法  三目运算符
        System.out.println(a>b?(a>c?a:c):b);
    }

    public static void main(String[] args) {
        learnOverride learnOverride=new learnOverride();
        learnOverride.mol(4);
        learnOverride.mol(3,4);
        learnOverride.mol("你好");
        learnOverride.max(7,90);
        learnOverride.max(8.8888,999.88);
        learnOverride.max(66.6,77.8,4.5);
    }
}
