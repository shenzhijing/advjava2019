package singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 10; i++) {
            System.out.println(Singleton.getInstance().getNextFlagNumber());
        }
        System.out.println("End.");
    }
}
