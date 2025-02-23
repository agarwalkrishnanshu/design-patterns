package CreationalPatterns.Singleton.BillPughSolution;

public class BillPughSingleton {

    private static int value;
    private BillPughSingleton(){
        System.out.println("Bill Pugh Solution Singleton");
        try {
            System.out.println("Thread going to sleep...");
            // Pause the thread for few seconds
            Thread.sleep(3000);
            value++;
        }catch (InterruptedException ex){
            System.out.println("Thread was interrupted..");
        }
        System.out.println("Program resumes after sleep...");
    }
    private static class BillPughSingletonHelper {
        private static final BillPughSingleton INSTANCE_OBJECT = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return BillPughSingletonHelper.INSTANCE_OBJECT;
    }
    public static int getValue(){
        return value;
    }
}
