package com.example.gcash.model;
import java.util.List;
import java.util.ArrayList;

public class ChatRequest {

    private String model;
    private List<Message> messages;
    private int n;
    private double temperature;

    // Default constructor
    public ChatRequest() {
    }

    public ChatRequest(String model, String prompt) {
        this.model = model;
        
        this.messages = new ArrayList<>();
        this.messages.add(new Message("user", prompt));
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }


}

