package com.dominikcebula.edu.design.patterns.mediator.components;

public class TextField extends AbstractComponent {
    private String value;

    public void setValue(String value) {
        this.value = value;
        mediator.onInputDataChange();
    }

    public void clearValue() {
        setValue(null);
    }

    public String getValue() {
        return value;
    }
}
