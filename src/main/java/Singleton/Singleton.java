package Singleton;

public class Singleton {
    private Singleton() {}  //私有构造函数
    private volatile static Singleton instance = null;  //单例对象
    //静态工厂方法
    public static Singleton getInstance() {
        if (instance == null) {      //双重检测机制
            synchronized (Singleton.class){  //同步锁
                if (instance == null) {     //双重检测机制
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}