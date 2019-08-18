package com.sky.guicekata.com.sky.guicekata.client;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.sky.guicekata.com.sky.guicekata.service.HTTPMessageService;
import com.sky.guicekata.com.sky.guicekata.service.MessageService;

public class KataModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(MessageService.class)
                .to(HTTPMessageService.class)
                .in(Scopes.SINGLETON);
    }
}
