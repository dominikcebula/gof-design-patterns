package com.dominikcebula.edu.design.patterns.behavioral.interpreter.query.engine.expression;

import com.dominikcebula.edu.design.patterns.behavioral.interpreter.query.engine.context.Context;

import java.util.List;

public class Field implements Expression {
    private final String filterFieldName;
    private final LessThan lessThan;

    public static Field field(String filterFieldName, LessThan lessThan) {
        return new Field(filterFieldName, lessThan);
    }

    public Field(String filterFieldName, LessThan lessThan) {
        this.filterFieldName = filterFieldName;
        this.lessThan = lessThan;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setFilterFieldName(filterFieldName);

        return lessThan.interpret(context);
    }
}
