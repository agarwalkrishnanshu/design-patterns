package BehavioralPatterns.ObserverDesignPattern;

import java.util.*;

public class Publisher {
    Map<String, List<Subscriber>> eventSubscriberMap = new HashMap<>();

    public Publisher(String... events){

        for(String event: events) {
            this.eventSubscriberMap.put(event, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, Subscriber subscriber){

        if(eventSubscriberMap.containsKey(eventType)){
            List<Subscriber> subscriberList = eventSubscriberMap.get(eventType);

            subscriberList.add(subscriber);
            System.out.println(subscriber + " Subscribed Successfully!");
        }
    }

    public void unsubscribe(String eventType, Subscriber subscriber){

        if(eventSubscriberMap.containsKey(eventType)){
            List<Subscriber> subscriberList = eventSubscriberMap.get(eventType);

            subscriberList.remove(subscriber);
            System.out.println(subscriber + " Unsubscribed Successfully!");
        }
    }

    public void notify(String eventType, String videoTitle){

        for(Subscriber subscriber : eventSubscriberMap.get(eventType)){
            subscriber.update(eventType, videoTitle);
        }
    }

}
