public class person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getDetails() {
        return "Name: " + name + "\nAge: " + age + "\nAddress: " + address;
    }
}
