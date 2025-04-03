package BehavioralPatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelImpl implements YoutubeChannel{
    private final String channelName;
    private final List<Subscriber> subscriberList = new ArrayList<>();

    YoutubeChannelImpl(String channelName){
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String videoTitle) {

        for(Subscriber subscriber: subscriberList){
            subscriber.update(this.channelName, videoTitle);
        }
    }

    public void uploadVideo(String videoTitle){
        System.out.println("\n🔔 " + channelName + " uploaded a new video: " + videoTitle);
        notifySubscribers(videoTitle);
    }
}
