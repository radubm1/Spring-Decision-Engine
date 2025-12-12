package com.example.tree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the decision engine bean
        DecisionEngine engine = ctx.getBean("decisionEngine", DecisionEngine.class);

        // Example input (attributes can be anything your rules.json expects)
        Map<String, String> input = Map.of(
            "Weather", "Sunny",
            "Humidity", "High",
            "Wind", "Weak"
        );

        // Evaluate against externalized rules
        String result = engine.evaluate(input);

        System.out.println("Decision outcome: " + result);
    }
}
