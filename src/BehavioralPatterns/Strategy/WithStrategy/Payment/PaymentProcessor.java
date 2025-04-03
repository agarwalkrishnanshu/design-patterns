package BehavioralPatterns.Strategy.WithStrategy.Payment;

public class PaymentProcessor {
    // This is the context Class for the strategy design pattern

    PayStrategy payStrategy;
    public void setPaymentStrategy(PayStrategy payStrategy){
        this.payStrategy = payStrategy;
    }
    public void checkout(int amount){
        if(payStrategy == null){
            System.out.println("No payment method selected");
            return;
        }
        payStrategy.pay(amount);
    }
}
