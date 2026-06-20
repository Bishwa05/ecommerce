package com.order.ecomm.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @KafkaListener(topics = "order-topic", groupId = "ecommerce-group")
    public void processOrder(String orderDetails) {
        // Process inventory logic here
        System.out.println("Processing inventory for order: " + orderDetails);
    }
}