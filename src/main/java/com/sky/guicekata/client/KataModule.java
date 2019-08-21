package com.sky.guicekata.client;

import com.google.inject.*;
import com.google.inject.name.Names;
import com.sky.guicekata.service.HTTPMessageService;
import com.sky.guicekata.service.KafkaMessageService;
import com.sky.guicekata.service.MessageService;

import javax.inject.Named;

public class KataModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(MessageService.class)
                .annotatedWith(Names.named("Emma"))
                .to(HTTPMessageService.class)
                .in(Scopes.SINGLETON);

        bind (KataClient.class)
                .toProvider(ClientProvider.class);
    }

    @Singleton
    @Provides
    @Named("Chris")
    public MessageService providesMessageService() {
        return new HTTPMessageService("CHRIS", 50, "lol", "deab", "lost", "RANDOMCHRIS");
    }
}
