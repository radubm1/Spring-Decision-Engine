package com.example.tree;

import java.util.List;
import java.util.Map;

public class DecisionEngine {
    private RulesProvider rulesProvider;

    public void setRulesProvider(RulesProvider rulesProvider) {
        this.rulesProvider = rulesProvider;
    }

    public String evaluate(Map<String, String> input) {
        List<DecisionRule> rules = rulesProvider.loadRules();
        return rules.stream()
                .filter(r -> r.matches(input))
                .map(DecisionRule::getOutcome)
                .findFirst()
                .orElse("Unknown");
    }
}
