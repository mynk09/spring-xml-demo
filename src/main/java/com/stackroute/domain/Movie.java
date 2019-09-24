package com.stackroute.domain;

import com.stackroute.domain.Actor;

public class Movie {
    private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void role(){
        System.out.println(this.actor);
    }
}
