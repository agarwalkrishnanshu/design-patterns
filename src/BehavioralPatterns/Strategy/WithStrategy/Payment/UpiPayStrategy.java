package BehavioralPatterns.Strategy.WithStrategy.Payment;

public class UpiPayStrategy implements PayStrategy {

    String upiId;

    @Override
    public boolean pay(int amount) {

        if(!upiId.isEmpty()){
            System.out.println("Paying " + amount + " using UPI");
            return true;
        }else{
            System.out.println("Please register your UPI before making payments");
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {

        upiId = "xyz@upi"; // UPI registered
    }
}
