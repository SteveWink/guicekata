package com.sky.guicekata.com.sky.guicekata.client;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import com.sky.guicekata.com.sky.guicekata.service.HTTPMessageService;
import com.sky.guicekata.com.sky.guicekata.service.MessageService;

public class KataModule extends AbstractModule {

    @Override
    protected void configure() {

    }

    @Provides
    public MessageService providesMessageService(){
        return new HTTPMessageService("myhost", 999, "HTTP", "steve", "password");
    }
}
