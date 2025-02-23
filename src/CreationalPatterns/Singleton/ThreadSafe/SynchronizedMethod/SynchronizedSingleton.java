package CreationalPatterns.Singleton.ThreadSafe.SynchronizedMethod;

public class SynchronizedSingleton {
    // The field must be declared volatile so that double check lock would work
    // correctly.
    private static SynchronizedSingleton instance;
    String value;

    private SynchronizedSingleton(String v){
        System.out.println("Program starts");
        try {
            // Pause the thread for 2 seconds
            System.out.println("Thread going to sleep...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
        System.out.println("Program resumes after sleep");
        value = v;
    }
    synchronized public static SynchronizedSingleton getInstance(String value){
        SynchronizedSingleton result = instance;
        if(instance == null){
            instance = new SynchronizedSingleton(value);
        }
        return instance;
    }
    public String getValue() {
        return value;
    }
}
