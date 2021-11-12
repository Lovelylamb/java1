package reflection;

public class ReflectionTest06 {
    public static void main(String[] args) throws ClassNotFoundException {

        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);  //AppClassLoader

        //获取系统加载器的父类加载器-->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);  //ExtClassLoader

        //获取扩展类加载器的父类加载器-->根加载器（c/c++）
        ClassLoader BootStrapClassLoader = parent.getParent();
        System.out.println(BootStrapClassLoader);  //null

        //测试当前类是哪个加载器
        ClassLoader classLoader = Class.forName("reflection.ReflectionTest06").getClassLoader();
        System.out.println(classLoader);  //AppClassLoader

        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);   //null


        //获取获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
    }
}
