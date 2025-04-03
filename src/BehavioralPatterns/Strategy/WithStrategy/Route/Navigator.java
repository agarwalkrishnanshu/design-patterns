package BehavioralPatterns.Strategy.WithStrategy.Route;

public class Navigator {

    RouteStrategy routeStrategy;

    Navigator(RouteStrategy routeStrategy){
        this.routeStrategy = routeStrategy;
    }

    public void getRoute(String source, String destination){
        System.out.println(this.routeStrategy.getRoute(source, destination));
    }
}
