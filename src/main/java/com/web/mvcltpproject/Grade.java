package com.web.mvcltpproject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Grade {
    private String name;
    private String subject;
    private String score;

    public Grade(String name, String subject, String score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }
}

