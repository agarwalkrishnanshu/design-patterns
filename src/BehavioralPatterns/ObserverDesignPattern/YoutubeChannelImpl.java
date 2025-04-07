package BehavioralPatterns.ObserverDesignPattern;

public class YoutubeChannelImpl {
    private final String channelName;
    public final Publisher publisher;

    YoutubeChannelImpl(String channelName){
        this.channelName = channelName;
        publisher = new Publisher("New Video", "Live");
    }

    public void uploadVideo(String videoTitle){
        System.out.println("\n🔔 " + channelName + " uploaded a new video: " + videoTitle);
        publisher.notify("New Video", videoTitle);
    }
    public void goLive(String videoTitle){
        System.out.println("\n🔔 " + channelName + " is goiing live: " + videoTitle);
        publisher.notify("Live", videoTitle);
    }
}
