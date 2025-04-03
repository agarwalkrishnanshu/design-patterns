package BehavioralPatterns.ObserverDesignPattern;

public interface Subscriber {
    void update(String channelName, String videoTitle);
}
