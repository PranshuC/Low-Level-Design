package designpatterns.adapter.external;

// Step 1 - Incompatible interfaces
public class RazorPayAPI {

    public void makePayment(String email, String phone) {
        System.out.println("Making payment via RazorPay");
    }

    public RazorPayStatus checkStatus(String paymentId) {
        return RazorPayStatus.SUCCESS;
    }
}
