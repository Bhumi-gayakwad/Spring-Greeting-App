package com.spring_greeting_app.spring_greeting_app.repository;

import com.spring_greeting_app.spring_greeting_app.model.GreetingEntity;

@Repository
public class GreetingRepository  extends JpaRepository<GreetingEntity, Long>  {

}
