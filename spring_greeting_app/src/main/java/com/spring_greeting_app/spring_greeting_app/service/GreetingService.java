package com.spring_greeting_app.spring_greeting_app.service;
import com.spring_greeting_app.spring_greeting_app.model.GreetingEntity;
import com.spring_greeting_app.spring_greeting_app.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring_greeting_app.spring_greeting_app.model.GreetingEntity;
import com.spring_greeting_app.spring_greeting_app.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

 

import java.util.Optional;

 
@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    public String getGreetingMessage() {
        return "Hello World!";
    }

 
    public List<GreetingEntity> getAllGreetings() {
        return greetingRepository.findAll();
    }

    public GreetingEntity updateGreeting(Long id, String newMessage) {
        Optional<GreetingEntity> existingGreeting = greetingRepository.findById(id);

        if (existingGreeting.isPresent()) {
            GreetingEntity greeting = existingGreeting.get();
            greeting.setMessage(newMessage);
            return greetingRepository.save(greeting);
        } else {
            throw new RuntimeException("Greeting not found with ID: " + id);
        }
    }
 
    public void deleteGreeting(Long id) {
        if (greetingRepository.existsById(id)) {
            greetingRepository.deleteById(id);
        } else {
            throw new RuntimeException("Greeting not found with ID: " + id);
        }
    }
 
 
  
    public GreetingEntity saveGreetingMessage(String message) {
        GreetingEntity greeting = new GreetingEntity(message);
        return greetingRepository.save(greeting);
    }
}