package BehavioralPatterns.Strategy.WithStrategy.Payment;

public class CreditCardPayStrategy implements PayStrategy {

    String creditCardNo;

    @Override
    public boolean pay(int amount) {

        if(!creditCardNo.isEmpty()){
            System.out.println("Paying " + amount + " using credit card");
            return true;
        }else{
            System.out.println("Please enter your credit card details before trying to make payments");
            return false;
        }

    }

    @Override
    public void collectPaymentDetails() {

        creditCardNo = "xxxxxxxxxxxxx"; // Sign in
    }
}
