package BehavioralPatterns.Strategy.WithStrategy.Route;

public class DriveRouteStrategy implements RouteStrategy{

    @Override
    public String getRoute(String source, String destination) {
        return "Driving Route from "+source + " to "+ destination;
    }

}
