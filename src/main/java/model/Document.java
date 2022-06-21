package model;

public abstract class Document implements Printable {
    public static Integer number;
    public static String name;

    public Document(Integer number) {
        Document.number = number;
    }

    public Document(Integer number, String name) {
        Document.number = number;
        Document.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printGeneralInformation() {
        System.out.println(
                "number=" + number +
                        ", name='" + name + '\''
        );
    }


}
