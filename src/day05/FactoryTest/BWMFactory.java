package day05.FactoryTest;

/**
 * 汽车生产工厂功能
 */

public interface BWMFactory {
    BWM productBWN();  //生产的方法，返回的是BWM
}

class BWM3Factory implements BWMFactory{

    @Override
    public BWM productBWN() {
        System.out.println("生产3系宝马");
        return new BWM3();  //接口的多态性
    }
}

class BWM5Factory implements BWMFactory{

    @Override
    public BWM productBWN() {
        System.out.println("生产5系宝马");
        return new BWM5();  //接口的多态性
    }
}

class BWM7Factory implements BWMFactory{

    @Override
    public BWM productBWN() {
        System.out.println("生产7系宝马");
        return new BWM7();  //接口的多态性
    }
}
