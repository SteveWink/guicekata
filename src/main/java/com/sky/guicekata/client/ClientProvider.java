package com.sky.guicekata.client;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.sky.guicekata.service.MessageService;
import org.mockito.internal.matchers.Null;

import javax.inject.Named;

public class ClientProvider implements Provider<KataClient> {

    private final KataClient kataClient;

    @Inject
    public ClientProvider(@Named("Emma") MessageService messageService, String chris) {
        kataClient = new KataClient(messageService, chris);
    }

    @Override
    public KataClient get() {
        System.out.println("i am a client provider");
        return kataClient;
    }
}
