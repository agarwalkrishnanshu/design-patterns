package BehavioralPatterns.Strategy.WithStrategy.Payment;

public class Client {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // User choose to pay using credit card
        paymentProcessor.setPaymentStrategy(new CreditCardPayStrategy("abcdefghijkl"));
        paymentProcessor.checkout(10000);

        // User choose to pay using credit card
        paymentProcessor.setPaymentStrategy(new PayPalPayStrategy("abc@example.com"));
        paymentProcessor.checkout(5000);

        // User choose to pay using credit card
        paymentProcessor.setPaymentStrategy(new UpiPayStrategy("987654321@upi"));
        paymentProcessor.checkout(100);

    }
}
