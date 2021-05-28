package day05.FactoryTest;

public class Test {
    public static void main(String[] args) {
        BWM bwm3 = new BWM3Factory().productBWN();
        bwm3.showInfo();
        BWM bwm5 = new BWM5Factory().productBWN();
        bwm5.showInfo();
        BWM bwm7 = new BWM7Factory().productBWN();
        bwm7.showInfo();
    }
}
