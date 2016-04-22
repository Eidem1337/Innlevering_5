
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Makes up the user interface (text based) of the application.
 * Responsible for all user interaction, like displaying the menu
 * and receiving input from the user.
 * 
 * @author asty
 */
        
class ApplicationUI {

    private Application application = null;
    
    private ApplicationRegUI applicationRegUI;

    /**
     * Creates an instance of the POSApplicationUI User interface. An instance
     * of the POSApplication is created, and initialized.
     */
    public ApplicationUI() {
        //TODO: Replace "new Application" with your application class.
        this.application = new Application();
        this.applicationRegUI = applicationRegUI;
    }

    /**
     * Starts the application by showing the menu and retrieving input from the
     * user.
     */
    void start() {
        this.application.init();

        boolean quit = false;

        while (!quit) {
            try {
                int menuSelection = this.showMenu();
                switch (menuSelection) {
                    case 1:
                        this.application.doListAllProducts();
                        break;
                        
                    case 2:
                        this.application.doFindProductByDescription();
                        break;
                        
                    case 3:
                        this.application.doRegisterBook();
                        break;
                        
                    case 4:
                        this.application.doRegisterBookSeries();
                        break;
                        
                    case 5:
                        this.application.doRegisterMagazine();
                        break;
                        
                    case 6:
                        this.application.doRegisterNewspaper();
                        break;
                        
                    case 7:
                        this.application.doRegisterPeriodical();
                        break;
                        
                    case 8:
                        System.out.println("\nThank you for using Application v0.1. Bye!\n");
                        quit = true;
                        break;

                    default:
                }
            } catch (InputMismatchException ime) {
                System.out.println("\nERROR: Please provide a number between 1 and 4..\n");
            }
        }        
        
    }

    /**
     * Displays the menu to the user, and waits for the users input. The user is
     * expected to input an integer between 1 and 5. If the user inputs anything
     * else, an InputMismatchException is thrown. The method returns the valid
     * input from the user.
     *
     * @return the menu number (between 1 and 5) provided by the user.
     * @throws InputMismatchException
     */
    private int showMenu() throws InputMismatchException {
        System.out.println("\n**** Application v0.1 ****\n");
        System.out.println("1. List all products");
        System.out.println("2. Find a product by name");
        System.out.println("3. Register Book");
        System.out.println("4. Register Book-series");
        System.out.println("5. Register Magazine");
        System.out.println("6. Register Newspaper");
        System.out.println("7. Register Periodical");
        System.out.println("8. EXIT\n");
        System.out.println("Please choose menu item (1-9): ");
 
        Scanner reader = new Scanner(System.in);
        int menuSelection = reader.nextInt();
        if ((menuSelection < 1) || (menuSelection > 9)) {
            throw new InputMismatchException();
        }
        return menuSelection;
    }
  

}
