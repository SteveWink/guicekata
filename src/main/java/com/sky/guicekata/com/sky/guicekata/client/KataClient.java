package com.sky.guicekata.com.sky.guicekata.client;

import com.google.inject.Inject;
import com.sky.guicekata.com.sky.guicekata.service.MessageService;

public class KataClient {

    private final MessageService messageService;

    @Inject
    public KataClient(MessageService messageService){
        this.messageService = messageService;

    }

    public void doSomethingWithData(String data, String person){
        String message = convertData(data);
        messageService.sendMessage(data, person);

    }

    private String convertData(String data) {
        return data;
    }


}
