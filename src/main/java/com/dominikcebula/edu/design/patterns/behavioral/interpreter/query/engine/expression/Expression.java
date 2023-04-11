package com.dominikcebula.edu.design.patterns.behavioral.interpreter.query.engine.expression;

import com.dominikcebula.edu.design.patterns.behavioral.interpreter.query.engine.context.Context;

import java.util.List;

public interface Expression {
    List<String> interpret(Context context);
}
