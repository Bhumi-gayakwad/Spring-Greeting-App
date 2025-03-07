package com.spring_greeting_app.spring_greeting_app.model;
import jakarta.persistence.*;
 

@Entity
@Table(name = "greetings")
public class GreetingEntity { @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
 
@Entity
@Table(name = "greetings")
public class GreetingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 

    private String message;

    public GreetingEntity() {
    }

    public GreetingEntity(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
 
}

 
}
 
