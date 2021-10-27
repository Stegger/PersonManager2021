package gui.javafx.studentbrowser;

import be.Person;

import java.util.ArrayList;
import java.util.List;

public class StudentBrowserModel {

    private List<Person> allStudents;

    public StudentBrowserModel()
    {
        allStudents = new ArrayList<>();
    }



    public void createStudent(int id, String name, String email)
    {
        Person person = new Person(id, name);
        allStudents.add(person);
    }

}
