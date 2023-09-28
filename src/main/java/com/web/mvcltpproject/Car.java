package com.web.mvcltpproject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private int value;
    private String name;

    public Car(String name, int value) {
        this.value = value;
        this.name = name;
    }
}
