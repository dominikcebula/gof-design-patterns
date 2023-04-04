package com.dominikcebula.edu.design.patterns.interpreter.query.engine;

import java.util.List;

public interface Expression {
    List<String> interpret(Context context);
}
