package CreationalPatterns.Singleton.ThreadSafe.SynchronizedMethod;

public class DemoSynchronizedSingleton{
    // We will try to test the naive single threaded singleton with multiple threads

    public static void main(String[] args) {
        System.out.println("Testing Synchronized DoubleCheckSingleton Implementation with Multiple Threads. ");
        System.out.println("If you see the same value, then the singleton was reused (Yaaayy!!) \nn" +
                "If you see two different values, then two singletons were created (Nahh!!) \n" +
                "Result: \n");
        Thread threadFoo = new Thread(new CreationalPatterns.Singleton.ThreadSafe.SynchronizedMethod.DemoSynchronizedSingleton.ThreadFoo());
        Thread threadBoo = new Thread(new CreationalPatterns.Singleton.ThreadSafe.SynchronizedMethod.DemoSynchronizedSingleton.ThreadBar());
        threadFoo.start();
        threadBoo.start();

    }
    static class ThreadFoo implements Runnable{
        @Override
        public void run() {
            SynchronizedSingleton singleton = SynchronizedSingleton.getInstance("Foo");
            System.out.println("Thread Foo: "+singleton.getValue());
        }
    }
    static class ThreadBar implements Runnable{
        @Override
        public void run() {
            SynchronizedSingleton singleton = SynchronizedSingleton.getInstance("Bar");
            System.out.println("Thread Bar: "+singleton.getValue());
        }
    }
}
