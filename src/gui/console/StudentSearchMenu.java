package gui.console;

import be.Student;
import bll.IStudentSearch;
import bll.PersonManager;
import bll.StudenNameEvaluater;
import bll.StudentEmailEvaluater;

import java.util.List;

public class StudentSearchMenu extends Menu {

    private PersonManager personManager;

    /**
     * Creates an instance of the class with the given header text and
     * menu options.
     *
     */
    public StudentSearchMenu(PersonManager personManager) {
        super("Student search menu",
                "Search by ID",
                "Search by name",
                "Search by email",
                "Search by course",
                "Search by failure grade");
        this.personManager = personManager;

    }

    @Override
    protected void doAction(int option) {
        switch (option)
        {
            case 1:
                break;
            case 2:
                for(Student s: personManager.searchForStudent(new StudenNameEvaluater("mia")))
                    System.out.println(s);
                break;
            case 3:
                for(Student s: personManager.searchForStudent(new StudentEmailEvaluater("cc")))
                    System.out.println(s);
                break;
            case 5:
                List<Student> failingStudents = personManager.searchForStudent(student -> student.getAverageGrade() <= 2.0);

        }
    }



}
