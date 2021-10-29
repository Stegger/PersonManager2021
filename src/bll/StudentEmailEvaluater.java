package bll;

import be.Student;

public class StudentEmailEvaluater implements IStudentSearch{

    private String email;

    public StudentEmailEvaluater(String email)
    {
        this.email = email;
    }

    @Override
    public boolean evaluateStudent(Student student)
    {
        return student.getEmail().toLowerCase().contains(email.toLowerCase());
    }
}
