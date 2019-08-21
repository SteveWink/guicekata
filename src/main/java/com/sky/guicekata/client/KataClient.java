package com.sky.guicekata.client;

import com.google.inject.Inject;
import com.sky.guicekata.service.MessageService;

import javax.inject.Named;

public class KataClient {

    private final MessageService messageService;
    private String chris;

    @Inject
    public KataClient(@Named("Emma") MessageService messageService, String chris){
        this.messageService = messageService;
        this.chris = chris;
    }

    public void doSomethingWithData(String data, String person){
        String message = convertData(data);
        messageService.sendMessage(data, person, chris);

    }

    private String convertData(String data) {
        return data;
    }


}
