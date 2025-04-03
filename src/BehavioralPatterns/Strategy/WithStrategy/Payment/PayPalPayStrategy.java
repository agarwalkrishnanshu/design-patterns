package BehavioralPatterns.Strategy.WithStrategy.Payment;

public class PayPalPayStrategy implements PayStrategy {

    private String email;
    private boolean signedIn = false;

    PayPalPayStrategy(String email){
        this.email = email;
        if(!email.isBlank()){
            signedIn = true;
        }
    }
    @Override
    public boolean pay(int amount) {

        if(signedIn){
            System.out.println("Paying " + amount + " using paypal " + email);
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
