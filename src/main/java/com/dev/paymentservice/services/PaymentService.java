package com.dev.paymentservice.services;

import com.dev.paymentservice.adapter.paymentgatewayadapters.Paymentgatewayadapter;
import com.dev.paymentservice.adapter.paymentgatewayadapters.paymentGatewayStrategy;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final paymentGatewayStrategy paymentGatewayStrategy;

    public PaymentService(paymentGatewayStrategy paymentGatewayStrategy) {
        this.paymentGatewayStrategy = paymentGatewayStrategy;
    }

    public String createPaymentLink(Long orderId){

       Long price=123L;
       Paymentgatewayadapter paymentgatewayadapter= paymentGatewayStrategy.getPaymentGateway();

       String url="";
       try {
              url= paymentgatewayadapter.createPaymentLink(price);
         } catch (Exception e) {
             e.printStackTrace();
       }

       return url;
   }
}
