package designpatterns.adapter.intefaces;

import designpatterns.adapter.models.PaymentRequest;
import designpatterns.adapter.models.PaymentStatus;

// Step 2 - Create adapter interface
public interface PaymentProvider {

    public void createPayment(PaymentRequest request);
    public PaymentStatus verifyStatus(String paymentId);
}
