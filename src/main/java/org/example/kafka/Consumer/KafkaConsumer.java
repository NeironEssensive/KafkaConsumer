package org.example.kafka.Consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "employee", groupId = "my_consumer")
    public void listen(String message) {
        log.info(message);
    };
}
