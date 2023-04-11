package com.dominikcebula.edu.design.patterns.behavioral.interpreter.query.engine.context;

import com.dominikcebula.edu.design.patterns.behavioral.interpreter.data.DataStore;
import com.fasterxml.jackson.databind.JsonNode;

public class Context {
    private final DataStore dataStore;

    private JsonNode collectionData;
    private String fieldNameToReturn;
    private String filterFieldName;
    private int lessThanValue;

    public Context(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public DataStore getDataStore() {
        return dataStore;
    }

    public JsonNode getCollectionData() {
        return collectionData;
    }

    public void setCollectionData(JsonNode collectionData) {
        this.collectionData = collectionData;
    }

    public String getFieldNameToReturn() {
        return fieldNameToReturn;
    }

    public void setFieldNameToReturn(String fieldNameToReturn) {
        this.fieldNameToReturn = fieldNameToReturn;
    }

    public String getFilterFieldName() {
        return filterFieldName;
    }

    public void setFilterFieldName(String filterFieldName) {
        this.filterFieldName = filterFieldName;
    }

    public int getLessThanValue() {
        return lessThanValue;
    }

    public void setLessThanValue(int lessThanValue) {
        this.lessThanValue = lessThanValue;
    }
}
