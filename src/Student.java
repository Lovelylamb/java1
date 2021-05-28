import java.util.Objects;
/**
 * 学生类
 */
public class Student {
    private String name;   //姓名
    private int age;      //年龄
    private String course;  //课程
    private String interest; //兴趣

    //显示学生信息
    public void showInfo(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("课程："+course);
        System.out.println("兴趣："+interest);
    }
    //无参构造方法
    public Student() {
    }

    //有参构造方法，一般如果写了有参构造方法，会重写掉无参构造方法，所以如果想使用无参构造方法，就得新建一个无参构造方法；
    public Student(String name, int age, String course, String interest) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.interest = interest;
    }
   //set和get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }
   //重写hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(course, student.course) &&
                Objects.equals(interest, student.interest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, course, interest);
    }


    //重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", interest='" + interest + '\'' +
                '}';
    }

}

class stuTest{
    public static void main(String[] args) {
        Student student=new Student("张三",19,"数学","地球");
        student.showInfo();
        System.out.println(student.toString());

        /**
         *  匿名对象：不定义对象的句柄，直接调用这个对象的方法，这样的对象
         *
         *  使用情况：1、如果一个对象只需进行一次方法调用，那么就可以使用匿名对象
         *          2、我们经常将匿名对象作为实参传递给一个方法进行使用
         */
        new Student().showInfo();    //匿名对象
    }
}
