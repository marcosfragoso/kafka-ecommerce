package org.alura.ecommercer;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class NewOrderMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try (var dispatcher = new KafkaDispatcher()){
            for (var i = 0; i < 10; i ++) {
                var key = UUID.randomUUID().toString();
                var value = key + ",345,567";
                dispatcher.send("ECOMMERCER_NEW_ORDER",key, value);

                var email = "Thank you for your order! We are processing your order!";
                dispatcher.send("ECOMMERCER_SEND_EMAIL", key, email);
            }
        }

    }


}
