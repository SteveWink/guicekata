package com.sky.guicekata.client;

import com.sky.guicekata.service.HTTPMessageService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class KataClientTest {

    @Mock
    private HTTPMessageService messageService;

    @InjectMocks
    private KataClient kataClient;

    @BeforeEach
    public  void doSetup(){

    }

    @Test
    void doSomethingWithDataSendsMessageToRecipient() {
        // given
        when(messageService.sendMessage(any(),any())).thenReturn(true);

        // when
        kataClient.doSomethingWithData("testData", "testPerson");

        // then
        Mockito.verify(messageService, times(1)).sendMessage(any(),any());

    }
}