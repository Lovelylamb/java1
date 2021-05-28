package day05.FactoryTest;

public interface BWM {
   //产品信息介绍
    //车的发动方式
    void showInfo();
}

class BWM3 implements BWM{
    @Override
    public void showInfo() {
        System.out.println("宝马3系");
    }
}

class BWM5 implements BWM{
    @Override
    public void showInfo() {
        System.out.println("宝马5系");
    }
}

class BWM7 implements BWM{
    @Override
    public void showInfo() {
        System.out.println("宝马7系");
    }
}
