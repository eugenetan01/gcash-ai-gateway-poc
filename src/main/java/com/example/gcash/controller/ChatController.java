package com.example.gcash.controller;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.gcash.model.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;


@RestController
public class ChatController {
    
    @Qualifier("openaiRestTemplate")
    @Autowired
    private RestTemplate restTemplate;
    
    @Value("${openai.model}")
    private String openai_model;
    
    @Value("${azure.model}")
    private String azure_model;

    @Value("${aiproxy.api.url}")
    private String apiUrl;
    
    @GetMapping("/chat")
    public String chat(@RequestParam String prompt, @RequestHeader String llm) {

        // verify the model to proxy to
        String model = null;

        if (llm.equals("azure")){
            model = azure_model;
        } else if (llm.equals("openai")){
            model = openai_model;
        }

        // create a request
        ChatRequest request = new ChatRequest(model, prompt);
        
        // call the API
        ChatResponse response = restTemplate.postForObject(apiUrl, request, ChatResponse.class);
        
        if (response == null || response.getChoices() == null || response.getChoices().isEmpty()) {
            return "No response";
        }
        
        // return the first response
        return response.getChoices().get(0).getMessage().getContent();
    }
}