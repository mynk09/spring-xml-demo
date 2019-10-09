package com.stackroute.domain;

public class Movie {

    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public  String role(){
        return String.valueOf(this.actor);

    }
}
