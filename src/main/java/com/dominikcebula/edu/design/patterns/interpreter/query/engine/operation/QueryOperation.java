package com.dominikcebula.edu.design.patterns.interpreter.query.engine.operation;

import com.dominikcebula.edu.design.patterns.interpreter.query.engine.context.Context;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.LinkedList;
import java.util.List;

public class QueryOperation {
    public List<String> execute(Context context) {
        List<String> returnValues = new LinkedList<>();

        JsonNode collectionData = context.getCollectionData();

        for (int i = 0; i < collectionData.size(); i++) {
            JsonNode jsonNode = collectionData.get(i);

            if (nodeMatchesQueryCondition(context, jsonNode))
                returnValues.add(getNodeValue(context, jsonNode));
        }

        return returnValues;
    }

    private boolean nodeMatchesQueryCondition(Context context, JsonNode jsonNode) {
        return getFilterFieldValue(context, jsonNode) < context.getLessThanValue();
    }

    private int getFilterFieldValue(Context context, JsonNode jsonNode) {
        return jsonNode.get(context.getFilterFieldName()).asInt();
    }

    private String getNodeValue(Context context, JsonNode jsonNode) {
        return jsonNode.get(context.getFieldNameToReturn()).asText();
    }
}
