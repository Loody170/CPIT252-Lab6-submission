package org.example;
public class CSVFormatter extends FormatDecorator {
    public CSVFormatter(BaseLogger logger) {
        this.logger = logger;
    }

    public String getLabel() {
        return logger.getLabel() + ", CSVFormatter";
    }

    public String getLevel() {
        return "Info " + logger.getLevel();
    }
}