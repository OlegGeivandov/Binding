package com.example.binding;

import javafx.beans.property.SimpleStringProperty;

public class Model {
    SimpleStringProperty s = new SimpleStringProperty();

    public Model(String str) {
        s.set(str);
    }

    public void preStar(){
        s.set("*" + s.get());
    }

    public void postStar(){
        s.set(s.get() + "*");
    }

}
