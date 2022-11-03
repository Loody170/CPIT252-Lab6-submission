package org.example;

public class DatabaseLogger extends BaseLogger{

    public DatabaseLogger() {
        label = "Console logger";
    }

    public String getLevel() {
        return "Database logger info";
    }
}
