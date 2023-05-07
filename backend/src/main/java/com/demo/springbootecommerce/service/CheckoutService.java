package com.demo.springbootecommerce.service;

import com.demo.springbootecommerce.dto.Purchase;
import com.demo.springbootecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
