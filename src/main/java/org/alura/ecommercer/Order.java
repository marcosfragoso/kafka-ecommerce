package org.alura.ecommercer;

import java.math.BigDecimal;

public class Order {
    private final String userId;
    private final BigDecimal amount;
    private final String orderId;

    public Order(String userId,  String orderId, BigDecimal amount) {
        this.userId = userId;
        this.amount = amount;
        this.orderId = orderId;
    }
}
