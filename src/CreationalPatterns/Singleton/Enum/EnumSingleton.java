package CreationalPatterns.Singleton.Enum;

public enum EnumSingleton {
    INSTANCE;

    public void showMessage(){
        System.out.println("Hello from Singleton");
        System.out.println(Thread.currentThread().getName() + " -> Instance: " + this.hashCode());
    }
}
