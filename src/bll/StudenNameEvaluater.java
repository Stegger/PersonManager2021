package bll;

import be.Student;

import java.util.Locale;

public class StudenNameEvaluater implements IStudentSearch {

    private String name;

    public StudenNameEvaluater(String name)
    {
        this.name = name;
    }

    @Override
    public boolean evaluateStudent(Student student) {
        boolean isThereAMatch = student.getName().toLowerCase().contains(name.toLowerCase());
        return isThereAMatch;
    }
}
