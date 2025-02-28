package com.spring_greeting_app.spring_greeting_app.service;
import com.spring_greeting_app.spring_greeting_app.model.GreetingEntity;
import com.spring_greeting_app.spring_greeting_app.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    public String getGreetingMessage() {
        return "Hello World!";
    }

    public GreetingEntity saveGreetingMessage(String message) {
        GreetingEntity greeting = new GreetingEntity(message);
        return greetingRepository.save(greeting);
    }

    public GreetingEntity getGreetingById(Long id) {
        Optional<GreetingEntity> greeting = greetingRepository.findById(id);
        return greeting.orElseThrow(() -> new RuntimeException("Greeting not found with ID: " + id));
    }
}
