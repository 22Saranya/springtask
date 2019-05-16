package com.stackroute.spring.domain.Configuration;

import com.stackroute.spring.domain.Actor;
import com.stackroute.spring.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean(name="movie")
    public Movie getMovieBean()
    {
        return new Movie(new Actor("Prabhas","male",40));
    }

  /* @Bean(name="actor")
   public Actor getBeanActor()
   {
       return new Actor("Shah",50,"Male");
   }*/
}

