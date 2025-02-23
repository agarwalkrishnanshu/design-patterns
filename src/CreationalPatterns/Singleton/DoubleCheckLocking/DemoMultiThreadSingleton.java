package CreationalPatterns.Singleton.DoubleCheckLocking;

public class DemoMultiThreadSingleton {
    // We will try to test the single threaded singleton with multiple threads

    public static void main(String[] args) {
        System.out.println("Using thread safe Double Check Locking Singleton");
        System.out.println("If you see the same value, then the singleton was reused (Yaaayy!!) \nn" +
                "If you see two different values, then two singletons were created (Nahh!!) \n" +
                "Result: \n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBoo = new Thread(new ThreadBar());
        threadFoo.start();
        threadBoo.start();
        System.out.println("This one should work because we are using thread safe DoubleCheckSingleton. \n" +
                "We are using Double Checked Locking here");
    }
    static class ThreadFoo implements Runnable{
        @Override
        public void run() {
            DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance("Foo");
            System.out.println("Thread Foo: "+ doubleCheckSingleton.getValue());
        }
    }
    static class ThreadBar implements Runnable{
        @Override
        public void run() {
            DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance("Bar");
            System.out.println("Thread Bar: "+ doubleCheckSingleton.getValue());
        }
    }
}
