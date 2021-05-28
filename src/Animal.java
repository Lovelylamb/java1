/**
 * 动物的类
 * @author chenshuai
 */
public class Animal {
     String name;  //动物的名字
     int eye;     //动物的眼睛数量
     int legs;   //动物的腿数量

    public Animal() {
    }

    public Animal(String name, int eye, int legs) {
        this.name = name;
        this.eye = eye;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEye() {
        return eye;
    }

    public void setEye(int eye) {
        this.eye = eye;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    /**
     * 输出动物吃的食物
     * @param food  食物
     */
    public  void eat(String food){
        System.out.println("此种动物的食物是："+food);
    }

    /**
     * 输出动物的移动方式
     * @param moveType  移动方式
     */
    public  void move(String moveType){
        System.out.println("此种动物的移动方式是:"+moveType);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", eye=" + eye +
                ", legs=" + legs +
                '}';
    }

        public static void main(String[] args) {
        //类的实例化
        //1、无参构造对对象进行实例初始化，在使用set成员方法进行赋值
        Animal animal=new Animal();
//        animal.eye=5;
//        animal.legs=5;
//        animal.name="猴子";
        animal.setEye(2);
        animal.setLegs(2);
        animal.setName("猩猩");

        //2、直接进行有参构造函数对对象进行初始化；
        Animal animal1=new Animal("houzi",1,1);

        System.out.println(animal.toString());
        System.out.println(animal1.toString());
        animal.eat("香蕉");
        animal.move("飞奔");
    }

}
