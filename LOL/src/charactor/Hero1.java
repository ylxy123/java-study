package charactor;

public class Hero1 {
    private Hero1(){
    }

    private static Hero1 instance = new Hero1();

    public static Hero1 getInstance(){
        return instance;
    }
}
