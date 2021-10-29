package gui.javafx.model;

import be.Person;
import be.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class StudentBrowserModel {

    private ObservableList<Student> allStudents;

    public StudentBrowserModel()
    {
        allStudents = FXCollections.observableArrayList();
    }

    public void createStudent(int id, String name, String email)
    {
        //allStudents.add(new Student(id,name, "CS"));
    }

    public ObservableList getAllStudents()
    {
        return allStudents;
    }
}
