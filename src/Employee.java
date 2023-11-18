public class Employee {
    private String name = "";
    private String email = "не задан";
    private int phone = 0000;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Employee(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public Employee(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void printInfo() {
        System.out.println("Name: " + name + "\n" +
                            "E-mail: " + email + "\n" +
                            "Phone: " + phone + "\n");
    }
}
