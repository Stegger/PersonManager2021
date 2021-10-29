package gui.console;

import bll.PersonManager;

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
                "Search by course");
        this.personManager = personManager;

    }

    @Override
    protected void doAction(int option) {
        switch (option)
        {

        }
    }
}
