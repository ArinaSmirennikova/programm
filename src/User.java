public class User {
    private String name = "";
    private int age = 0;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getUserName() {
        return name;
    }

    public int getUserAge() {
        return age;
    }
}
