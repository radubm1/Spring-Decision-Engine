# Spring Decision Engine

A lightweight **decision engine built with Spring Framework** that allows developers to define, evaluate, and execute business rules in a structured way. This project is designed to demonstrate how decision logic can be externalized from application code, making it easier to maintain, extend, and test.

---

## ✨ Features
- **Rule-based decision engine** using Spring Boot.
- **Modular design**: easily extend with new rules and decision flows.
- **XML/Java configuration support** for flexible rule definitions.
- **Pluggable architecture**: integrate with external systems or services.
- **100% Java implementation** for portability and simplicity.

---

## 📂 Project Structure
```
Spring-Decision-Engine/
├── src/main/          # Main source code
├── target/            # Build output
├── pom.xml            # Maven build configuration
├── .classpath         # Eclipse project settings
├── .project           # Eclipse project settings
└── .settings/         # IDE-specific settings
```

---

## 🚀 Getting Started

### Prerequisites
- Java 17+ (recommended)
- Maven 3.8+
- An IDE such as IntelliJ IDEA or Eclipse

### Installation
Clone the repository:
```bash
git clone https://github.com/radubm1/Spring-Decision-Engine.git
cd Spring-Decision-Engine
```

Build the project:
```bash
mvn clean install
```

Run the application:
```bash
mvn spring-boot:run
```

---

## 🛠 Usage
1. Define your decision rules in the `src/main` package.
2. Configure rules via Spring beans or external configuration files.
3. Inject the decision engine into your services and call:
   ```java
   DecisionEngine engine = new DecisionEngine();
   DecisionResult result = engine.evaluate(inputData);
   ```
4. Extend with custom evaluators, conditions, or actions.

---

## 📖 Example
```java
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
```

---

## 📦 Build & Test
Run unit tests:
```bash
mvn test
```

Generate JAR:
```bash
mvn package
```

---

## 🤝 Contributing
Contributions are welcome!  
- Fork the repository  
- Create a feature branch (`git checkout -b feature/my-feature`)  
- Commit changes (`git commit -m 'Add new feature'`)  
- Push to branch (`git push origin feature/my-feature`)  
- Open a Pull Request  

---

## 📜 License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## 👤 Author
Developed by [radubm1](https://github.com/radubm1).


---
