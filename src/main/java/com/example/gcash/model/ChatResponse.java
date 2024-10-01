package com.example.gcash.model;
import java.util.List;


public class ChatResponse {

    private List<Choice> choices;

    // Default constructor
    public ChatResponse() {
    }

    // Constructor with parameters
    public ChatResponse(List<Choice> choices) {
        this.choices = choices;
    }

    // Getter for choices
    public List<Choice> getChoices() {
        return choices;
    }

    // Setter for choices
    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    // Inner static class Choice
    public static class Choice {

        private int index;
        private Message message;

        // Default constructor
        public Choice() {
        }

        // Constructor with parameters
        public Choice(int index, Message message) {
            this.index = index;
            this.message = message;
        }

        // Getter for index
        public int getIndex() {
            return index;
        }

        // Setter for index
        public void setIndex(int index) {
            this.index = index;
        }

        // Getter for message
        public Message getMessage() {
            return message;
        }

        // Setter for message
        public void setMessage(Message message) {
            this.message = message;
        }
    }
}
