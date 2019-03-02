package singleton;

public class Singleton {
    private int flag = 1000;
    private static Singleton singleton = new Singleton();       
    private Singleton() {
    	System.out.println("new a Singleton");
    }                                                               
    public static Singleton getInstance() {                       
        System.out.println("get an instance");
    	return singleton;                                           
    }                                                               
    public synchronized int getNextFlagNumber() {                 
        return flag++;
    }
}
