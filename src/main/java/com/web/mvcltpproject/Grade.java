package com.web.mvcltpproject;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
public class Grade {
    private String name;
    private String subject;
    private String score;
    private String id;

    public Grade() {
        this.id = UUID.randomUUID().toString();
    }


}

