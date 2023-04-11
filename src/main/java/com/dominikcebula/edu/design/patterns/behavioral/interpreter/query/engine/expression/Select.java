package com.dominikcebula.edu.design.patterns.behavioral.interpreter.query.engine.expression;

import com.dominikcebula.edu.design.patterns.behavioral.interpreter.query.engine.context.Context;

import java.util.List;

public class Select implements Expression {
    private final String fieldNameToReturn;
    private final Where where;

    public static Select select(String fieldNameToReturn, Where where) {
        return new Select(fieldNameToReturn, where);
    }

    public Select(String fieldNameToReturn, Where where) {
        this.fieldNameToReturn = fieldNameToReturn;
        this.where = where;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setFieldNameToReturn(fieldNameToReturn);

        return where.interpret(context);
    }
}
