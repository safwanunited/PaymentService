package com.dev.paymentservice.adapter.paymentgatewayadapters;

import com.dev.paymentservice.adapter.paymentgatewayadapters.RazorPay.razorpayPaymentGatewayAdapter;
import com.dev.paymentservice.adapter.paymentgatewayadapters.stripe.stripePaymentGatewayAdapter;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class paymentGatewayStrategy {
    private final stripePaymentGatewayAdapter stripePaymentGatewayAdapter;

    private static Random random=new Random();

    public paymentGatewayStrategy(stripePaymentGatewayAdapter stripePaymentGatewayAdapter) {
        this.stripePaymentGatewayAdapter = stripePaymentGatewayAdapter;
    }

    public  Paymentgatewayadapter getPaymentGateway(){

        return stripePaymentGatewayAdapter;


//Just For Testing Commenting out
//        int isEven=random.nextInt(100);
//        if(isEven%2==0){
//            return new razorpayPaymentGatewayAdapter();
//        }
//        else {
//            return new stripePaymentGatewayAdapter();
//        }
    }
}
