package extendPracise;

/**
 * 练习1；(1)定义一个Mankind类，包括：
 *                         成员变量int sex 和int salary
 *                         方法void manOrWomen(); 根据sex 显示“man”(sex==1)或者“women”(sex==0)
 *                         定义void employeed();  根据salary的值显示“no job”(salary==0) 或者“job”(salary==1)
 *       (2)定义类kids继承Mankind,并包括
 *                         成员变量int yearOld;
 *                         方法printAge()打印yearOld;
 *       (3)在kids继承Main方法里实例化kids的对象somekid,用该对象访问其父类的成员变量及方法
 */
public class Mankind {
    int sex;
    int salary;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWomen(){
        if(sex==1){
            System.out.println("man");
        }else if(sex==0){
            System.out.println("women");
        }else{
            System.out.println("不是人类");
        }
    }

    public void employeed(){
        if(salary==1){
            System.out.println("job");
        }else if(salary==0){
            System.out.println("nojob");
        }else{
            System.out.println("***");
        }
    }

}
