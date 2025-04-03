package BehavioralPatterns.Strategy.WithStrategy.Payment;

public class CreditCardPayStrategy implements PayStrategy {

    String cardNumber;

    CreditCardPayStrategy(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(int amount) {

        if(!cardNumber.isEmpty()){
            System.out.println("Paying " + amount + " using credit card");
            return true;
        }else{
            System.out.println("Please enter your credit card details before trying to make payments");
            return false;
        }

    }

    @Override
    public void collectPaymentDetails() {
        cardNumber = "xxxxxxxxxxxxxx"; // Sign in
    }
}
