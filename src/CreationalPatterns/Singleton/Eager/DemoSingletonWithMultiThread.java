package CreationalPatterns.Singleton.Eager;

public class DemoSingletonWithMultiThread {
    // We will try to test the single threaded eager singleton with multiple threads

    public static void main(String[] args) {
        System.out.println("If you see the same value, then the singleton was reused (Yaaayy!!) \n" +
                "If you see two different values, then two singletons were created (Nahh!!) \n" +
                "Result: \n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBoo = new Thread(new ThreadBar());
        threadFoo.start();
        threadBoo.start();
        System.out.println("This one should work because we are using thread safe DoubleCheckSingleton. \n" +
                "We are using Eager Initialization here");
    }
    static class ThreadFoo implements Runnable{
        @Override
        public void run() {
            EagerSingleton singleton = EagerSingleton.getInstance();
            System.out.println("Thread Foo: "+EagerSingleton.getValue());
        }
    }
    static class ThreadBar implements Runnable{
        @Override
        public void run() {
            EagerSingleton singleton = EagerSingleton.getInstance();
            System.out.println("Thread Bar: "+EagerSingleton.getValue());
        }
    }
}
