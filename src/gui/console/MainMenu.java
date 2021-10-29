package gui.console;

import be.Person;
import bll.PersonManager;

public class MainMenu extends Menu {

    private PersonManager personManager;

    /**
     * Creates an instance of the class with the given header text and
     * menu options.
     */
    public MainMenu() {
        super("Main menu", "Teacher administration", "Student administration", "See errrribody");
        this.personManager = new PersonManager();
    }


    @Override
    protected void doAction(int option) {
        switch (option) {
            case 1:
                System.out.println("Administrate teachers");
                break;
            case 2:
                new StudentMenu(personManager).run();
                break;
            case 3:
                printEveryPerson();
                break;
            default:
                System.out.println("Whaaat???");
        }
    }

    private void printEveryPerson()
    {
        clear();
        System.out.println("List of every person");
        for(Person p : personManager.getAllPersons())
        {
            System.out.println(p);
        }
        pause();
    }


}
