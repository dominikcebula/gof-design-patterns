package com.dominikcebula.edu.design.patterns.interpreter.query.engine;

import com.dominikcebula.edu.design.patterns.interpreter.data.DataStore;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.LinkedList;
import java.util.List;

public class Context {
    private final DataStore dataStore;

    private JsonNode collectionData;
    private String fieldNameToReturn;
    private String filterFieldName;
    private int lessThanValue;

    public Context(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    DataStore getDataStore() {
        return dataStore;
    }

    void setCollectionData(JsonNode collectionData) {
        this.collectionData = collectionData;
    }

    void setFieldNameToReturn(String fieldNameToReturn) {
        this.fieldNameToReturn = fieldNameToReturn;
    }

    void setFilterFieldName(String filterFieldName) {
        this.filterFieldName = filterFieldName;
    }

    void setLessThanValue(int lessThanValue) {
        this.lessThanValue = lessThanValue;
    }

    List<String> executeSelect() {
        List<String> returnValues = new LinkedList<>();

        for (int i = 0; i < collectionData.size(); i++) {
            JsonNode jsonNode = collectionData.get(i);

            if (jsonNode.get(filterFieldName).asInt() < lessThanValue)
                returnValues.add(jsonNode.get(fieldNameToReturn).asText());
        }

        return returnValues;
    }
}
