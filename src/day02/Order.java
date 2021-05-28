package day02;

import java.util.Objects;

public class  Order {
    private int orderId ;
    private String orderName;

    public Order() {
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId &&
                Objects.equals(orderName, order.orderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderName);
    }

}
class Test{
    public static void main(String[] args) {
       Order order=new Order(1,"heihei");
       Order order1=new Order(1,"heihei");
        System.out.println(order.equals(order1));          // true因为重写了equals方法，所以两个对象用equals，比较值
        System.out.println(order == order1);             //false
    }

}
