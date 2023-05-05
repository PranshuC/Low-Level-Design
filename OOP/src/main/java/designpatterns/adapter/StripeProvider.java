package designpatterns.adapter;

import designpatterns.adapter.external.StripeAPI;
import designpatterns.adapter.external.StripeStatus;
import designpatterns.adapter.intefaces.PaymentProvider;
import designpatterns.adapter.models.PaymentRequest;
import designpatterns.adapter.models.PaymentStatus;

public class StripeProvider implements PaymentProvider {

    private StripeAPI api = new StripeAPI();

    @Override
    public void createPayment(PaymentRequest request) {
        api.pay(request.getEmail());
    }

    @Override
    public PaymentStatus verifyStatus(String paymentId) {
        return toStatus(api.status(paymentId));
    }

    // Check mapStruct
    private PaymentStatus toStatus(StripeStatus status) {
        if(status == StripeStatus.OK)
            return PaymentStatus.SUCCESS;
        return PaymentStatus.ERROR;
    }
}
