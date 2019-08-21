package com.sky.guicekata.client;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.sky.guicekata.service.MessageService;

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
        KataClient kataClient = injector.getInstance(KataClient.class);
        kataClient.doSomethingWithData("lololol", "Chris");

    }
}
