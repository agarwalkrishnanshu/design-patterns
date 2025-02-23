package CreationalPatterns.Singleton.DoubleCheckLocking;

public class DoubleCheckSingleton {
    // The field must be declared volatile so that double check lock would work correctly.
    // If we have created any object then any read and write should happen from the memory and the cores should not store it in the cache
    // that is why the volatile keyword is used
    private static volatile DoubleCheckSingleton instance;
    String value;

    private DoubleCheckSingleton(String v){
        System.out.println("Program starts");
        try {
            // Pause the thread for 2 seconds
            System.out.println("Thread going to Sleep...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
        System.out.println("Program resumes after sleep");
        value = v;
    }
    public static DoubleCheckSingleton getInstance(String value){
        DoubleCheckSingleton result = instance;
        if(result != null){
            return result;
        }
        synchronized (DoubleCheckSingleton.class){
            if(instance == null){
                instance = new DoubleCheckSingleton(value);
            }
            return instance;
        }
    }
    public String getValue() {
        return value;
    }
}
