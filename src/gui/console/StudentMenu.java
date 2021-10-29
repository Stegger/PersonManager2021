package gui.console;

import be.Person;
import be.Student;
import bll.PersonManager;

public class StudentMenu extends Menu {
    private PersonManager personManager;

    /**
     * Creates an instance of the class with the given header text and
     * menu options.
     */
    public StudentMenu(PersonManager personManager) {
        super("Student Menu",
                "See all students",
                "Add student",
                "Search for students");

        this.personManager = personManager;
    }

    @Override
    protected void doAction(int option) {
        switch (option) {
            case 2:
                personManager.addPerson(new Student(666, "Bob", "nan@easv.dk", "BYG"));
                System.out.println("Added BOB");
                for (Person p : personManager.getAllPersons()
                ) {
                    System.out.println(p);
                }
                System.out.println("Done in StudentMenu");
                break;
            case 3:
                new StudentSearchMenu(personManager).run();
            default:
                System.out.println("What?");

        }
    }
}
