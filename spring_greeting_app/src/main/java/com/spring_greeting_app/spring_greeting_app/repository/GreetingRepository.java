package com.spring_greeting_app.spring_greeting_app.repository;

import com.spring_greeting_app.spring_greeting_app.model.GreetingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository  extends JpaRepository<GreetingEntity, Long> {

}
