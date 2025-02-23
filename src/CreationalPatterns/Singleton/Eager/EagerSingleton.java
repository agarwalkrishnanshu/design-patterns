package CreationalPatterns.Singleton.Eager;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private static int value;
    // private constructor to avoid client applications using the constructor
    private EagerSingleton(){
        System.out.println("Program starts");
        try {
            // Pause the thread for 2 seconds
            System.out.println("Thread going to sleep..!");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
        System.out.println("Program resumes after sleep");
        value++;
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
    public static int getValue(){
        return value;
    }
}