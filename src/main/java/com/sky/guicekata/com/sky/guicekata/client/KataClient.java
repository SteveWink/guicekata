package com.sky.guicekata.com.sky.guicekata.client;

import com.sky.guicekata.com.sky.guicekata.service.MessageService;

public class KataClient {

    private final MessageService messageService;

    public KataClient(){
        messageService = new MessageService("myhost", 9000, "HTTP", "steve", "password");

    }

    public void doSomethingWithData(String data, String person){
        String message = convertData(data);
        messageService.sendMessage(data, person);

    }

    private String convertData(String data) {
        return data;
    }


}
