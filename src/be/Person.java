package be;

public abstract class Person {

    private int id;
    private String name;
    private String email;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public abstract void doSomething();


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return String.format("%-5s %-20s %-20s", id, name, email);
    }
}
