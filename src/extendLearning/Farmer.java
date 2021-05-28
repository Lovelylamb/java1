package extendLearning;

import java.io.InputStream;
import java.net.URL;

public class Farmer extends Person {

    public static void main(String[] args) {

        int i=0;
        while(i<10){
            Farmer farmer=new Farmer();
            System.out.println("对象的内存地址"+System.identityHashCode(farmer));
            //farmer.showInfo();
            i++;
        }

    }
    @Override
    public void showInfo() {
        super.showInfo();
    }
}
