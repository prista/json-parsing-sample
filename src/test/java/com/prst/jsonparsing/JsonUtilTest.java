package com.prst.jsonparsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.prst.jsonparsing.pojo.SimplePojo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonUtilTest {

    private String jsonString = "{ \"title\": \"Parsing Json in Java\", \"author\": \"Prista\" }";

    @Test
    void parse() throws JsonProcessingException {
        final JsonNode node = JsonUtil.parse(jsonString);
        System.out.println(node.get("title").asText());
        assertEquals(node.get("title").asText(), "Parsing Json in Java");
    }

    @Test
    void fromJson() throws JsonProcessingException {
        final JsonNode node = JsonUtil.parse(jsonString);
        final SimplePojo pojo = JsonUtil.fromJson(node, SimplePojo.class);
        assertEquals(pojo.getTitle(), "Parsing Json in Java");
    }
}