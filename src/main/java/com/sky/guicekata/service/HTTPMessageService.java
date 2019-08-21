package com.sky.guicekata.service;

public class HTTPMessageService implements MessageService{

    private String host;
    private int port;
    private String protocol;
    private String username;
    private String password;
    private String chris;

    public HTTPMessageService(){
        this("EMMA", 1, "protocol", "steve", "password", "ranDOOOOM");
    }

    public HTTPMessageService(String host, int port, String protocol, String username, String password, String chris) {
        this.host = host;
        this.port = port;
        this.protocol = protocol;
        this.username = username;
        this.password = password;
        this.chris = chris;
    }

    public boolean sendMessage(String message, String recipient, String chris){
        System.out.println("sending a message via HTTP - "+ message + recipient);
        System.out.println("The host is: " + host);
        return true;
    }
}
