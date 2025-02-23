package CreationalPatterns.Singleton.Lazy;

public class LazySingleton {
    private static LazySingleton instance;
    private String value;

    private LazySingleton(String value){
        System.out.println("Program starts");
        try {
            // Pause the thread for 2 seconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
        System.out.println("Program resumes after sleep");
        this.value = value;
    }

    public static LazySingleton getInstance(String value){
        if(instance == null){
            instance = new LazySingleton(value);
        }
        return instance;
    }
    public String getValue(){
        return value;
    }

}
