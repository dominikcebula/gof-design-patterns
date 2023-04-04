package com.dominikcebula.edu.design.patterns.interpreter.query.engine;

import com.dominikcebula.edu.design.patterns.interpreter.data.DataStore;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

public class FromCollection implements Expression {
    private final String collectionName;
    private final Select select;

    public static FromCollection fromCollection(String collectionName, Select select) {
        return new FromCollection(collectionName, select);
    }

    public FromCollection(String collectionName, Select select) {
        this.collectionName = collectionName;
        this.select = select;
    }

    @Override
    public List<String> interpret(Context context) {
        DataStore dataStore = context.getDataStore();

        JsonNode collectionData = dataStore.getCollection(collectionName);
        context.setCollectionData(collectionData);

        return select.interpret(context);
    }
}
