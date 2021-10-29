package gui.console;

public class MainMenu extends Menu {

    /**
     * Creates an instance of the class with the given header text and
     * menu options.
     *
     */
    public MainMenu() {
        super("Main menu", "Teacher administration", "Student administration");
    }



    @Override
    protected void doAction(int option) {
        switch (option) {
            case 1:
                System.out.println("Administrate teachers");
                break;
            case 2:
                System.out.println("Administrate students");
                break;
            default:
                System.out.println("Whaaat???");
        }
    }


}
