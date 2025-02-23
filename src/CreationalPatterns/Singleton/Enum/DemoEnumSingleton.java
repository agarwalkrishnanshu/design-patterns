package CreationalPatterns.Singleton.Enum;

import CreationalPatterns.Singleton.BillPughSolution.BillPughSingleton;
import CreationalPatterns.Singleton.BillPughSolution.DemoBillPughSingleton;

public class DemoEnumSingleton {
    public static void main(String[] args) {
        System.out.println("Using Bill Pugh Singleton");
        System.out.println("If you see the same value, then the singleton was reused (Yaaayy!!) \nn" +
                "If you see two different values, then two singletons were created (Nahh!!) \n" +
                "Result: \n");

        Thread threadFoo = new Thread(new Task());
        Thread threadBar = new Thread(new Task());
        Thread thread3 = new Thread(new Task());

        // start all threads
        threadFoo.start();
        threadBar.start();
        thread3.start();

        System.out.println("This one should work because we are using thread safe Bill Pugh Singleton with nested static class.");

    }
    static class Task implements Runnable {
        EnumSingleton enumSingleton;

        @Override
        public void run() {
            EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
            enumSingleton.showMessage();
        }

        public EnumSingleton getEnumSingleton() {
            return enumSingleton;
        }
    }
}
