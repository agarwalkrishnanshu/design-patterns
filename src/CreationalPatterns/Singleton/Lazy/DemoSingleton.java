package CreationalPatterns.Singleton.Lazy;

public class DemoSingleton {
    public static void main(String[] args) {
        System.out.println("Testing Naive Single Threaded Implementation with Single Thread. ");
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (boo!!)" + "\n\n" +
                "RESULT:" + "\n");
        System.out.println("Making first call... FOO");
        LazySingleton singleton = LazySingleton.getInstance("FOO");
        System.out.println("Making second call.. BAR");
        LazySingleton anotherSingleton = LazySingleton.getInstance("BAR");
        System.out.println("DoubleCheckSingleton 1 FOO: "+singleton.getValue());
        System.out.println("DoubleCheckSingleton 2 BAR: "+anotherSingleton.getValue());
    }
}
