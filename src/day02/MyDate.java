package day02;

import java.util.Objects;

/**
 * 日期类，比较两个类的对象中的年月日是否相同
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year &&
                month == myDate.month &&
                day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}

class MyDateTest{
    public static void main(String[] args) {
        MyDate myDate=new MyDate(2020,1,1);
        MyDate myDate1=new MyDate(2020,1,1);
        System.out.println(myDate ==myDate1);        //false
        System.out.println(myDate.equals(myDate1));   //true
    }
}