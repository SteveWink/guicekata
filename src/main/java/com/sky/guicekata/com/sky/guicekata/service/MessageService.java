package com.sky.guicekata.com.sky.guicekata.service;



public class MessageService {

    private String host;
    private int port;
    private String protocol;
    private String username;
    private String password;

    public MessageService(String host, int port, String protocol, String username, String password) {
        this.host = host;
        this.port = port;
        this.protocol = protocol;
        this.username = username;
        this.password = password;
    }

    public void sendMessage(String message, String recipient){
        System.out.println("sending a message via email");
    }
}
