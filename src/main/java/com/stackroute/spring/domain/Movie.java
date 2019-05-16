package com.stackroute.spring.domain;

import com.stackroute.spring.domain.Actor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
public class Movie{
    private Actor actor;


    public Movie() {
    }

    public Actor getActor() {
        return actor;
    }


    public Movie(Actor actor){

        this.actor=actor;
    }

    public void setActor(Actor actor) {

        this.actor = actor;
    }
    @Override
    public String toString() {
        return "Actor{" +
                "actor='" + actor + '\'' +
                '}';
    }

}
