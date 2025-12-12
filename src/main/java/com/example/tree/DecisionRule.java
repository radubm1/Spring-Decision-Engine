package com.example.tree;

import java.util.Map;

public class DecisionRule {
    private Map<String, String> conditions; // attribute -> expected value
    private String outcome;

    // Default constructor for Jackson
    public DecisionRule() {}

    public DecisionRule(Map<String, String> conditions, String outcome) {
        this.conditions = conditions;
        this.outcome = outcome;
    }

    public Map<String, String> getConditions() {
        return conditions;
    }

    public void setConditions(Map<String, String> conditions) {
        this.conditions = conditions;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public boolean matches(Map<String, String> input) {
        return conditions.entrySet().stream()
                .allMatch(e -> e.getValue().equalsIgnoreCase(input.get(e.getKey())));
    }
}
