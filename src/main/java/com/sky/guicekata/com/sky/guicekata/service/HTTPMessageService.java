package com.sky.guicekata.com.sky.guicekata.service;



public class HTTPMessageService implements MessageService{

    private String host;
    private int port;
    private String protocol;
    private String username;
    private String password;

    public HTTPMessageService(){
        this("host", 1, "protocol", "steve", "password");
    }

    public HTTPMessageService(String host, int port, String protocol, String username, String password) {
        this.host = host;
        this.port = port;
        this.protocol = protocol;
        this.username = username;
        this.password = password;
    }

    public boolean sendMessage(String message, String recipient){
        System.out.println("sending a message via HTTP - "+ message + recipient);
        return true;
    }
}
