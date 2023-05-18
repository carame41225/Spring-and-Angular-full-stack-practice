package com.demo.springbootecommerce.service;

import com.demo.springbootecommerce.dto.PaymentInfo;
import com.demo.springbootecommerce.dto.Purchase;
import com.demo.springbootecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
