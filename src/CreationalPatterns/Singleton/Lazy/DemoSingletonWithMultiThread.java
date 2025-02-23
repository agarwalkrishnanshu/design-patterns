package CreationalPatterns.Singleton.Lazy;

public class DemoSingletonWithMultiThread {
    // We will try to test the naive single threaded singleton with multiple threads

    public static void main(String[] args) {
        System.out.println("Testing Lazy Single Threaded Implementation with Multiple Threads. ");
        System.out.println("If you see the same value, then the singleton was reused (Yaaayy!!) \nn" +
                "If you see two different values, then two singletons were created (Nahh!!) \n" +
                "Result: \n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBoo = new Thread(new ThreadBar());
        threadFoo.start();
        threadBoo.start();
        System.out.println("This one fails because we are using Naive Single Threaded DoubleCheckSingleton. \n" +
                "We will implement the multithreaded one in the thread safe package ");
    }
    static class ThreadFoo implements Runnable{
        @Override
        public void run() {
            LazySingleton singleton = LazySingleton.getInstance("Foo");
            System.out.println("Thread Foo: "+singleton.getValue());
        }
    }
    static class ThreadBar implements Runnable{
        @Override
        public void run() {
            LazySingleton singleton = LazySingleton.getInstance("Bar");
            System.out.println("Thread Bar: "+singleton.getValue());
        }
    }
}
