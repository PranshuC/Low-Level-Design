package designpatterns.adapter;

import designpatterns.adapter.external.RazorPayAPI;
import designpatterns.adapter.external.RazorPayStatus;
import designpatterns.adapter.intefaces.PaymentProvider;
import designpatterns.adapter.models.PaymentRequest;
import designpatterns.adapter.models.PaymentStatus;

// Step 3 - Concrete Providers
public class RazorPayProvider implements PaymentProvider {

    private RazorPayAPI api = new RazorPayAPI();
    @Override
    public void createPayment(PaymentRequest request) {
        api.makePayment(request.getEmail(), request.getPhoneNumber());
    }

    @Override
    public PaymentStatus verifyStatus(String paymentId) {
        RazorPayStatus status = api.checkStatus(paymentId);
        return toStatus(status);
    }

    private PaymentStatus toStatus(RazorPayStatus status) {
        if(status == RazorPayStatus.SUCCESS)
            return PaymentStatus.SUCCESS;
        return PaymentStatus.ERROR;
    }
}
