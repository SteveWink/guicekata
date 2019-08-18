package com.sky.guicekata.com.sky.guicekata.client;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.sky.guicekata.com.sky.guicekata.service.MessageService;

public class ClientApplication {

    public static void main(String[] args){

        ClientApplication clientApplication = new ClientApplication();
        clientApplication.doStuff();

    }

    public ClientApplication(){

    }

    public void doStuff(){
        Injector injector = Guice.createInjector(new KataModule());
        System.out.println("Done");
        MessageService messageService = injector.getInstance(MessageService.class);
        messageService.sendMessage("Hello", "world");
    }
}
