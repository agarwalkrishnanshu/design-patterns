package BehavioralPatterns.ObserverDesignPattern;

public class YoutubeNotificationExample {
    public static void main(String[] args) {
        YoutubeChannelImpl youtubeChannel = new YoutubeChannelImpl("Concept&Coding");

        Subscriber alice = new EmailSubscriber("Alice");
        Subscriber bob = new MobileSubscriber("Bob");
        Subscriber charlie = new EmailSubscriber("Charlie");

        youtubeChannel.subscribe(alice);
        youtubeChannel.subscribe(bob);
        youtubeChannel.subscribe(charlie);

        youtubeChannel.uploadVideo("Observer Design Pattern");

        youtubeChannel.unsubscribe(charlie);

        youtubeChannel.uploadVideo("Strategy Design Pattern");
    }
}
