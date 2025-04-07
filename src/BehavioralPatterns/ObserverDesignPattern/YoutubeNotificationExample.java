package BehavioralPatterns.ObserverDesignPattern;

public class YoutubeNotificationExample {
    public static void main(String[] args) {
        YoutubeChannelImpl youtubeChannel = new YoutubeChannelImpl("Concept & Coding");

        Subscriber alice = new EmailSubscriber("Alice");
        Subscriber bob = new MobileSubscriber("Bob");
        Subscriber charlie = new EmailSubscriber("Charlie");

        youtubeChannel.publisher.subscribe("New Video", alice);
        youtubeChannel.publisher.subscribe("Live", alice);

        youtubeChannel.publisher.subscribe("Live", bob);

        youtubeChannel.publisher.subscribe("New Video", charlie);

        youtubeChannel.uploadVideo("Observer Design Pattern");

        youtubeChannel.goLive("Q&A Session with Me");

        youtubeChannel.publisher.unsubscribe("New Video", charlie);
        youtubeChannel.uploadVideo("Strategy Design Pattern");
    }
}
