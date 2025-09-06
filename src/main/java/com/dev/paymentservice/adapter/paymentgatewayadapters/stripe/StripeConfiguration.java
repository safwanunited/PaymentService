package com.dev.paymentservice.adapter.paymentgatewayadapters.stripe;

import com.stripe.StripeClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StripeConfiguration {
    @Value("${stripe.api.key}")
    private String stripeApiKey;

    @Bean
    public StripeClient getStripeCleint(){
        return new StripeClient(stripeApiKey);
    }
}
