package model;

public enum OrderStatus {
    CREATED("СОЗДАН"), EXECUTED("ИСПОЛНЕН");

    private final String text;

    OrderStatus(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
