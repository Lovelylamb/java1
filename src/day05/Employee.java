    package day05;

    import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

    /**
     * 练习2：编写一个Employee类，声明为抽象类，包含以下属性：name,id,salary。提供必要的构造器和抽象方法；work();对于manager类来说，他既是
     * 员工，还具有奖金(bonus)属性。请使用继承的思想，设计CommonEmployee类和manager类，要求类中提供必要的方法进行属性访问；
     */
    public abstract class Employee {
        String name;
        int    id;
        double salary;
        public Employee() {
        }

        public Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        public abstract  void work();   //抽象方法work();
    }

    class CommonEmployee extends  Employee{
        public void setCommonEmployeeInfo(int id,String name,double salary){
            super.id = id;
            super.name =  name;
            super.salary = salary;
        }

        public void getCommonEmployeeInfo(){
            System.out.println(super.id);
            System.out.println(super.name);
            System.out.println(super.salary);
        }
        @Override
        public void work() {
            System.out.println("员工的工作");
        }
    }

    class Manager extends  Employee{
        double Bonus;  //管理员比其他员工多了个奖金；

        public void setCommonEmployeeInfo(int id,String name,double salary,double bonus){
            super.id = id;
            super.name =  name;
            super.salary = salary;
            this.Bonus = bonus;
        }

        public void getCommonEmployeeInfo(){
            System.out.println(super.id);
            System.out.println(super.name);
            System.out.println(super.salary);
            System.out.println(this.Bonus);
        }

        @Override
        public void work() {
            System.out.println("管理者的工作");
        }
    }

    class Test1{
        public static void main(String[] args) {
            CommonEmployee commonEmployee=new CommonEmployee();
            commonEmployee.work();
            commonEmployee.setCommonEmployeeInfo(1,"张三", 66.6);
            commonEmployee.getCommonEmployeeInfo();


            Manager manager =new Manager();
            manager.work();
            manager.setCommonEmployeeInfo(1,"张校长", 108.8,100000.00);
            manager.getCommonEmployeeInfo();
        }
    }