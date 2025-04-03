package BehavioralPatterns.ObserverDesignPattern;

public interface YoutubeChannel {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers(String videoTitle);
}
