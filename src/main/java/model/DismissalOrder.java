package model;

public class DismissalOrder extends Order {

    private String reason;

    public DismissalOrder(Integer number, String employee) {
        super(number, employee);
    }

    public DismissalOrder(Integer number, String name, String employee, String text, String reason) {
        super(number, name, employee, text);
        this.reason = reason;
    }

    @Override
    public void print(boolean simple) {
        if (simple) {
            printGeneralInformation();
        } else System.out.println(this);

    }


    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "number=" + number +
                ", name='" + name + '\'' +
                ", employee='" + employee + '\'' +
                ", text='" + text + '\'' +
                ", status=" + status.getText() +
                ", reason='" + reason + '\'';
    }
}
