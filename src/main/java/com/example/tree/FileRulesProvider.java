package com.example.tree;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.util.List;

public class FileRulesProvider implements RulesProvider {
    private String location;

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public List<DecisionRule> loadRules() {
    	try (InputStream is = getClass().getResourceAsStream("/rules.json")) {
    	    ObjectMapper mapper = new ObjectMapper();
    	    return mapper.readValue(is,
    	        mapper.getTypeFactory().constructCollectionType(List.class, DecisionRule.class));
    	} catch (Exception e) {
            throw new RuntimeException("Failed to load rules", e);
        }
    }
}
