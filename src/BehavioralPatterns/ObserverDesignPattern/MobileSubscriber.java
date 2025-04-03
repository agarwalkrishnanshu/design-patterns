package BehavioralPatterns.ObserverDesignPattern;

public class MobileSubscriber implements Subscriber{
    String name;

    MobileSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println(name +" received a mobile notification: "+channelName + " uploaded "+videoTitle);
    }

    @Override
    public String toString(){
        return name + "(Email)";
    }
}
