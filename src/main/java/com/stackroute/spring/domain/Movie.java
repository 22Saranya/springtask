package com.stackroute.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    private Actor actor;


    public Movie() {
    }

    public Actor getActor() {
        return actor;
    }

    @Autowired
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
