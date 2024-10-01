package com.example.gcash.model;

public class Message {

    private String role;
    private String content;

    // constructor, getters and setters

    public Message(String role, String content){
        this.role = role;
        this.content = content;
    }
    
    public String getRole(){
        return role;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public void setRole(String role){
        this.role = role;
    }
}

