package BehavioralPatterns.Strategy.WithStrategy.Route;

public class RidingRouteStrategy implements RouteStrategy{

    @Override
    public String getRoute(String source, String destination) {
        return "Riding Route from "+source + " to "+ destination;
    }

}
