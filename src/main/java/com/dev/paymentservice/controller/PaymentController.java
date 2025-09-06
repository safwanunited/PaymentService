package com.dev.paymentservice.controller;

import com.dev.paymentservice.dtos.CreatePaymentLinkRequestDto;
import com.dev.paymentservice.dtos.CreatePaymentLinkResponseDto;
import com.dev.paymentservice.services.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public CreatePaymentLinkResponseDto createPaymentLink(@RequestBody CreatePaymentLinkRequestDto request){

        String url=paymentService.createPaymentLink(request.getOrderId());
        CreatePaymentLinkResponseDto response=new CreatePaymentLinkResponseDto();
        response.setUrl(url);
        return response;

}

}
