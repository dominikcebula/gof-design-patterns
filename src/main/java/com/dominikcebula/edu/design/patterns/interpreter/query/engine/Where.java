package com.dominikcebula.edu.design.patterns.interpreter.query.engine;

import java.util.List;

public class Where implements Expression {
    private final Field field;

    public static Where where(Field field) {
        return new Where(field);
    }

    private Where(Field field) {
        this.field = field;
    }

    @Override
    public List<String> interpret(Context context) {
        return field.interpret(context);
    }
}
