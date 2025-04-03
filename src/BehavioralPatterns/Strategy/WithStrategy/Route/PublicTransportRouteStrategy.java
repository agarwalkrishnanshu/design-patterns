package BehavioralPatterns.Strategy.WithStrategy.Route;

public class PublicTransportRouteStrategy implements RouteStrategy{

    @Override
    public String getRoute(String source, String destination) {
        return "Public Transport Route from "+source + " to "+ destination;
    }

}
