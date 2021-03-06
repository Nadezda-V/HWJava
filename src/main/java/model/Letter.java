package model;

import model.Document;

public class Letter extends Document {
    private String to;
    private String from;

    public Letter(Integer number) {
        super(number);
    }

    public Letter(Integer number, String name, String to, String from) {
        super(number, name);
        this.to = to;
        this.from = from;
    }

    @Override
    public void print(boolean simple) {
        if (simple) {
            printGeneralInformation();
        } else System.out.println(this);

    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "number=" + number +
                ", name='" + name + '\'' +
                ", to='" + to + '\'' +
                ", from='" + from + '\'';
    }
}
