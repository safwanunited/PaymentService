package com.dev.paymentservice.adapter.paymentgatewayadapters.stripe;

import com.dev.paymentservice.adapter.paymentgatewayadapters.Paymentgatewayadapter;
import com.stripe.Stripe;
import com.stripe.StripeClient;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentLink;
import com.stripe.param.PaymentLinkCreateParams;
import org.springframework.stereotype.Service;

@Service
public class stripePaymentGatewayAdapter implements Paymentgatewayadapter {

    private final StripeClient stripeClient;

    public stripePaymentGatewayAdapter(StripeClient stripeClient) {
        this.stripeClient = stripeClient;
    }

    @Override
    public String createPaymentLink(Long price) throws Exception {

//        Stripe.apiKey = "{{TEST_SECRET_KEY}}";
//
//        PaymentLinkCreateParams params =
//                PaymentLinkCreateParams.builder()
//                        .addLineItem(
//                                PaymentLinkCreateParams.LineItem.builder().setQuantity(3L).setPrice("100").build()
//                        )
//                        .addLineItem(
//                                PaymentLinkCreateParams.LineItem.builder().setQuantity(2L).setPrice("1000").build()
//                        )
//                        .setAfterCompletion(
//                                PaymentLinkCreateParams.AfterCompletion.builder()
//                                        .setType(PaymentLinkCreateParams.AfterCompletion.Type.REDIRECT)
//                                        .setRedirect(
//                                                PaymentLinkCreateParams.AfterCompletion.Redirect.builder()
//                                                        .setUrl("https://www.google.com/")
//                                                        .build()
//                                        )
//                                        .build()
//                        )
//                        .setCurrency("INR")
//                        .setInvoiceCreation(
//                                PaymentLinkCreateParams.InvoiceCreation.builder().setEnabled(true).build()
//                        )
//                        .build();

//        PaymentLink paymentLink = PaymentLink.create(params);



        //payemt link create code
        PaymentLinkCreateParams params =
                PaymentLinkCreateParams.builder()
                        .addLineItem(
                                PaymentLinkCreateParams.LineItem.builder()
                                        .setPrice("price_1S4FPKFzXbjBJn7BDKSySUYD")
                                        .setQuantity(1L)
                                        .build()
                        )
                        .setAfterCompletion(
                                PaymentLinkCreateParams.AfterCompletion.builder()
                                        .setType(PaymentLinkCreateParams.AfterCompletion.Type.REDIRECT)
                                        .setRedirect(
                                                PaymentLinkCreateParams.AfterCompletion.Redirect.builder()
                                                        .setUrl("https://www.google.com/")
                                                        .build()
                                        )
                                        .build()
                        )
                        .setCurrency("INR")
                        .setInvoiceCreation(
                                PaymentLinkCreateParams.InvoiceCreation.builder().setEnabled(true).build()
                        )
                        .build();

        PaymentLink paymentLink = stripeClient.paymentLinks().create(params);
        return paymentLink.getUrl();
    }
}
