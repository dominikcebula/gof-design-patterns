package com.dominikcebula.edu.design.patterns.behavioral.interpreter;

import com.dominikcebula.edu.design.patterns.behavioral.interpreter.data.DataStore;
import com.dominikcebula.edu.design.patterns.behavioral.interpreter.query.engine.context.Context;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

import static com.dominikcebula.edu.design.patterns.behavioral.interpreter.query.engine.expression.Field.field;
import static com.dominikcebula.edu.design.patterns.behavioral.interpreter.query.engine.expression.FromCollection.fromCollection;
import static com.dominikcebula.edu.design.patterns.behavioral.interpreter.query.engine.expression.LessThan.lessThan;
import static com.dominikcebula.edu.design.patterns.behavioral.interpreter.query.engine.expression.Select.select;
import static com.dominikcebula.edu.design.patterns.behavioral.interpreter.query.engine.expression.Where.where;

public class Runner {
    public static void main(String[] args) throws JsonProcessingException {
        DataStore dataStore = new DataStore();
        dataStore.addCollection("cities",
                """
                        [
                            { "name": "London", "population": "8799800" },
                            { "name": "Berlin", "population": "3850809" },
                            { "name": "Madrid", "population": "3305408" },
                            { "name": "Vienna", "population": "1982442" },
                            { "name": "Warsaw", "population": "1863056" },
                            { "name": "Budapest", "population": "1706851" }
                        ]
                        """);

        Context context = new Context(dataStore);

        List<String> cityNamesWithSmallPopulation =
                fromCollection("cities",
                        select("name",
                                where(field("population",
                                        lessThan(2000000))))
                ).interpret(context);

        System.out.println("Query Result = " + cityNamesWithSmallPopulation);
    }
}
