package BehavioralPatterns.Strategy.WithStrategy.Route;


public class Client {

    public static void main(String[] args) {

        DriveRouteStrategy driveRouteStrategy = new DriveRouteStrategy();
        WalkingRouteStrategy walkingRouteStrategy = new WalkingRouteStrategy();
        RidingRouteStrategy ridingRouteStrategy = new RidingRouteStrategy();
        PublicTransportRouteStrategy publicTransportRouteStrategy = new PublicTransportRouteStrategy();

        Navigator navigator = new Navigator(driveRouteStrategy);

        navigator.getRoute("Hyderabad", "Banglore");

        // Changing the drive strategy to walking
        Navigator walkingNavigator = new Navigator(walkingRouteStrategy);
        walkingNavigator.getRoute("Udipi", "Sarath City");

        // Changing the drive strategy to public transport
        Navigator publicTransportStrategy = new Navigator(publicTransportRouteStrategy);
        publicTransportStrategy.getRoute("Hyderbad", "Banglore City");

        // Changing the drive strategy to riding
        Navigator ridingStrategy = new Navigator(ridingRouteStrategy);
        ridingStrategy.getRoute("Hyderbad", "Banglore City");
    }
}
