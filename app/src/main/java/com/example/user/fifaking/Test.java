package com.example.user.fifaking;

import java.io.Serializable;

public class Test implements Serializable {
    private String text;

    public Test(){

    }

    public Test(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
