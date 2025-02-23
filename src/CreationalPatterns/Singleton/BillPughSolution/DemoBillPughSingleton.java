package CreationalPatterns.Singleton.BillPughSolution;

import java.sql.SQLOutput;

public class DemoBillPughSingleton {
    public static void main(String[] args) {
        System.out.println("Using Bill Pugh Singleton");
        System.out.println("If you see the same value, then the singleton was reused (Yaaayy!!) \nn" +
                "If you see two different values, then two singletons were created (Nahh!!) \n" +
                "Result: \n");

        Thread threadFoo = new Thread(new ThreadFoo());
        threadFoo.start();
        Thread threadBar = new Thread(new ThreadBar());
        threadBar.start();

        System.out.println("This one should work because we are using thread safe Bill Pugh Singleton with nested static class.");

    }
    static class ThreadFoo implements Runnable{
        @Override
        public void run(){
            BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
            System.out.println("ThreadFoo: "+BillPughSingleton.getValue());
        }
    }
    static class ThreadBar implements Runnable{
        @Override
        public void run(){
            BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
            System.out.println("ThreadBar: "+BillPughSingleton.getValue());
        }
    }
}
