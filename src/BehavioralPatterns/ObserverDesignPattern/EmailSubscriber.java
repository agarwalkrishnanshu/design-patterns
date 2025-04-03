package BehavioralPatterns.ObserverDesignPattern;

public class EmailSubscriber implements Subscriber{
    String name;

    EmailSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println(name +" Email notification:  "+channelName + " uploaded "+videoTitle);
    }

    @Override
    public String toString(){
        return name + "(Email)";
    }
}
