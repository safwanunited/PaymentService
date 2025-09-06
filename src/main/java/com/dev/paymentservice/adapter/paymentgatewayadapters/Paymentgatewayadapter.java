package com.dev.paymentservice.adapter.paymentgatewayadapters;

public interface Paymentgatewayadapter {
    String createPaymentLink(Long price) throws Exception;
}
