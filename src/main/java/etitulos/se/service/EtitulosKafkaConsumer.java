package etitulos.se.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class EtitulosKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(EtitulosKafkaConsumer.class);
    private static final String TOPIC = "topic_etitulos";

    @KafkaListener(topics = "topic_etitulos", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
