package com.dev.paymentservice.adapter.paymentgatewayadapters.RazorPay;

import com.dev.paymentservice.adapter.paymentgatewayadapters.Paymentgatewayadapter;

public class razorpayPaymentGatewayAdapter implements Paymentgatewayadapter {

    @Override
    public String createPaymentLink(Long price) {
        return "";
    }
}
