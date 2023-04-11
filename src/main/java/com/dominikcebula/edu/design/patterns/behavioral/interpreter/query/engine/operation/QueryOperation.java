package com.dominikcebula.edu.design.patterns.behavioral.interpreter.query.engine.operation;

import com.dominikcebula.edu.design.patterns.behavioral.interpreter.query.engine.context.Context;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.LinkedList;
import java.util.List;

public class QueryOperation {
    public List<String> execute(Context context) {
        List<String> returnValues = new LinkedList<>();

        JsonNode collectionData = context.getCollectionData();

        for (int i = 0; i < collectionData.size(); i++) {
            JsonNode jsonNode = collectionData.get(i);

            if (nodeValueMatchesQueryCondition(context, jsonNode))
                returnValues.add(getSelectFieldValue(context, jsonNode));
        }

        return returnValues;
    }

    private boolean nodeValueMatchesQueryCondition(Context context, JsonNode jsonNode) {
        return getFilterByFieldValue(context, jsonNode) < context.getLessThanValue();
    }

    private int getFilterByFieldValue(Context context, JsonNode jsonNode) {
        return jsonNode.get(context.getFilterFieldName()).asInt();
    }

    private String getSelectFieldValue(Context context, JsonNode jsonNode) {
        return jsonNode.get(context.getFieldNameToReturn()).asText();
    }
}
