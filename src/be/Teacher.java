package be;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private String initials;
    private List<String> subjects;
    private double salary;

    public Teacher(int id, String name, String email, String initials) {
        super(id, email, name);
        subjects = new ArrayList<>();
        this.initials = initials;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public String getInitials() {
        return initials;
    }


    @Override
    public void doSomething() {
        System.out.println("Teach");
    }

    @Override
    public String toString() {
        String mainSubject = "";
        if (!subjects.isEmpty())
            mainSubject = subjects.get(0);
        return super.toString() + String.format("%-20s %-20s", initials, mainSubject);
    }
}
