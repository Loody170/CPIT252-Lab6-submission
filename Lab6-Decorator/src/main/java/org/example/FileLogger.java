package org.example;

public class FileLogger extends BaseLogger{
    public FileLogger() {
        label = "file logger";
    }

    public String getLevel() {
        return "File logger info";
    }
}
