package designpatterns.adapter.external;

public class StripeAPI {

    public void pay(String email) {
        System.out.println("Making payment via Stripe");
    }

    public StripeStatus status(String paymentId) {
        return StripeStatus.OK;
    }
}
