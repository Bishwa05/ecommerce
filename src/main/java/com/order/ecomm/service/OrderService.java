package com.order.ecomm.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void createOrder(String orderDetails) {
        kafkaTemplate.send("order-topic", orderDetails);
    }
}

