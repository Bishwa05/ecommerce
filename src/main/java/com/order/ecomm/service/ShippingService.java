package com.order.ecomm.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    @KafkaListener(topics = "order-topic", groupId = "ecommerce-group")
    public void processOrder(String orderDetails) {
        // Process shipping logic here
        System.out.println("Processing shipping for order: " + orderDetails);
    }
}

