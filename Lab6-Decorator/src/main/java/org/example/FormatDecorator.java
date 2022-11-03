package org.example;

public abstract class FormatDecorator extends BaseLogger {
    BaseLogger logger;
    // All format decorators have to reimplement the getLabel method
    public abstract String getLabel();
}