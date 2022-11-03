package org.example;

public class ConsoleLogger extends BaseLogger {
    public ConsoleLogger() {
        label = "Console logger";
    }

    public String getLevel() {
        return "Console info";
    }
}