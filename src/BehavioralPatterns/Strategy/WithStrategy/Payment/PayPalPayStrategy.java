package BehavioralPatterns.Strategy.WithStrategy.Payment;

public class PayPalPayStrategy implements PayStrategy {

    private boolean signedIn = false;

    @Override
    public boolean pay(int amount) {

        if(signedIn){
            System.out.println("Paying " + amount + " using paypal");
            return true;
        }else{
            System.out.println("Please sign in before making payments");
            return false;
        }

    }

    @Override
    public void collectPaymentDetails() {

        signedIn = true; // Sign in
    }
}
