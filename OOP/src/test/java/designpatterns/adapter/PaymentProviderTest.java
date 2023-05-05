package designpatterns.adapter;

import designpatterns.adapter.intefaces.PaymentProvider;
import designpatterns.adapter.models.PaymentRequest;
import designpatterns.adapter.models.PaymentStatus;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PaymentProviderTest {

    private PaymentProvider provider;

    @Before
    public void setUp() {
        //provider = new RazorPayProvider();
        provider = new StripeProvider();
    }

    @Test
    public void testPayment() {
        //assertTrue("If RazorPay is used, instance should be of RazorPayProvider", provider instanceof RazorPayProvider);
        assertTrue("If RazorPay is used, instance should be of RazorPayProvider", provider instanceof StripeProvider);
        provider.createPayment(PaymentRequest.builder().email("test@email").build());
    }

    @Test
    public void testStatus() {
        PaymentStatus status = provider.verifyStatus("someId");
        assertEquals("If test status is called, it should return success", PaymentStatus.SUCCESS, status);
    }
}
