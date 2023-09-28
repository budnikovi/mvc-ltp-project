package com.web.mvcltpproject;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Show {
    private String title;
    private String episode;
    private String rating;

    public Show(String title, String episode, String rating) {
        this.title = title;
        this.episode = episode;
        this.rating = rating;
    }
}
