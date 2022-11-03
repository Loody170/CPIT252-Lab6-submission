package org.example;

public class HTMLFormatter extends FormatDecorator{
    public HTMLFormatter(BaseLogger logger) {
        this.logger = logger;
    }

    public String getLabel() {
        return logger.getLabel() + ", CSVFormatter";
    }

    public String getLevel() {
        return "Info " + logger.getLevel();
    }
}
