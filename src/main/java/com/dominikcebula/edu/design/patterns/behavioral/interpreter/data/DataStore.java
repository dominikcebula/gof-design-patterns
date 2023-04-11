package com.dominikcebula.edu.design.patterns.behavioral.interpreter.data;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class DataStore {
    private final ObjectMapper objectMapper = new ObjectMapper();

    private final Map<String, JsonNode> collections = new HashMap<>();

    public void addCollection(String collectionName, String jsonData) throws JsonProcessingException {
        collections.put(collectionName, objectMapper.readTree(jsonData));
    }

    public JsonNode getCollection(String collectionName) {
        return collections.get(collectionName);
    }
}
