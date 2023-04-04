package com.dominikcebula.edu.design.patterns.interpreter.query.engine;

import java.util.List;

public class LessThan implements Expression {
    private final int lessThanValue;

    public static LessThan lessThan(int lessThanValue) {
        return new LessThan(lessThanValue);
    }

    public LessThan(int lessThanValue) {
        this.lessThanValue = lessThanValue;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setLessThanValue(lessThanValue);

        return context.executeSelect();
    }
}
