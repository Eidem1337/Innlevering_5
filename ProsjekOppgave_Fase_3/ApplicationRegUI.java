import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kristian
 */
 class ApplicationRegUI {
     
     private Application application = null;
     
     public ApplicationRegUI() {
        //TODO: Replace "new Application" with your application class.
        this.application = new Application();
    
}
     void start() {
    this.application.init();

    boolean quit = false;

    while (!quit) {
        try {
            int menuSelection = this.registerMenu();
            switch (menuSelection) {
                case 1:
                    this.application.doRegisterBook();
                    break;

                case 2:
                    this.application.doRegisterBookSeries();
                    break;

                case 3:
                    this.application.doRegisterMagazine();
                    break;
                    
                case 4:
                    this.application.doRegisterNewspaper();
                    break;
                    
                case 5:
                    this.application.doRegisterPeriodical();
                    break;

                case 6:
                    System.out.println("\nThank you for using Application v0.1. Bye!\n");
                    quit = true;
                    break;

                default:
            }
        } catch (InputMismatchException ime) {
            System.out.println("\nERROR: Please provide a number between 1 and 4..\n");
        }
    }        
    
} public int registerMenu() throws InputMismatchException{
     System.out.println("\n**** Application v0.1 ****\n");
     System.out.println("1. Register Book");
     System.out.println("2. Register Book-series");
     System.out.println("3. Register Magazine");
     System.out.println("4. Register Newspaper");
     System.out.println("5. Register Periodical");
     System.out.println("6. Exit\n");
     System.out.println("Please choose menu item (1-6): ");
     
     Scanner reader = new Scanner(System.in);
     int menuSelection = reader.nextInt();
     if ((menuSelection < 1) || (menuSelection > 6)) {
         throw new InputMismatchException();
     }
     return menuSelection;
 }
 }

