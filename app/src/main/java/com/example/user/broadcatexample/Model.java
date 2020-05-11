package com.example.user.broadcatexample;

import java.io.Serializable;

/**
 * Created by User on 03-04-2017.
 */

public class Model implements Serializable {

    private boolean isSelected;
    private String name;
    private String emailId;

    public Model(){}
    public Model(boolean isSelected,String name) {

        this.isSelected = isSelected;
        this.name=name;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
