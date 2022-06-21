package model;

import model.Order;

public class ReceptionOrder extends Order {
    public ReceptionOrder(Integer number, String employee) {
        super(number, employee);
    }

    public ReceptionOrder(Integer number, String name, String employee, String text) {
        super(number, name, employee, text);
    }

    @Override
    public void print(boolean simple) {
        if (simple) {
            printGeneralInformation();
        } else System.out.println(this);

    }

    @Override
    public String toString() {
        return "number=" + number +
                ", name='" + name + '\'' +
                ", employee='" + employee + '\'' +
                ", text='" + text + '\'' +
                ", status=" + status.getText();
    }
}
