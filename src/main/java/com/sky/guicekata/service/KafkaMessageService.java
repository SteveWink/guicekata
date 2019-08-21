package com.sky.guicekata.service;

public class KafkaMessageService implements MessageService {
    @Override
    public boolean sendMessage(String message, String recipient, String chris) {
        System.out.println("Message: " + message + " from: "  + recipient + " <---------------------------kafka message");
        return true;
    }
}
