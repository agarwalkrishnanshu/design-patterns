package BehavioralPatterns.Strategy.WithStrategy.Payment;

public interface PayStrategy {

    boolean pay(int amount);
    void collectPaymentDetails();
}
