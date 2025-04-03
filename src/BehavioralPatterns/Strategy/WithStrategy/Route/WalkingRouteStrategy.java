package BehavioralPatterns.Strategy.WithStrategy.Route;

public class WalkingRouteStrategy implements RouteStrategy{
    @Override
    public String getRoute(String source, String destination) {
        return "Walking Route from "+source + " to "+ destination;
    }
}
